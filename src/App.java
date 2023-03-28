import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {

        File file = new File("lib/text.txt");        
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello world");
        bw.newLine();
        bw.write("Hello Java");
        bw.close();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String content ="";        
        String line = br.readLine();

        while(line!=null){
            content+=line+System.lineSeparator();
            line=br.readLine();
        }
        System.out.println(content);
        br.close();

    }   
    
    
    
    
}
