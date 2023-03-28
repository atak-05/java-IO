import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class ReadObject {
    public  void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Nesneler okunuyor..");

        try (FileInputStream fis = new FileInputStream("lib/person.bin")){
            ObjectInputStream ois = new ObjectInputStream(fis);
            person person1 = (person)ois.readObject();
            person person2 = (person)ois.readObject();
             
            System.out.println(person1+"\n"+person2);
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
