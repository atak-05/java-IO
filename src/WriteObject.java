import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        System.out.println("Nesneler yazdırılıyor..");
        person person1 = new person(1,"Cenk");
        System.out.println("birinci nesne yazdırıldı..");
        person person2 = new person(2,"Gizem");
        System.out.println("ikinci nesne yazdırıldı..");

        try (FileOutputStream fos = new FileOutputStream("lib/person.bin")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        };
    }
}
