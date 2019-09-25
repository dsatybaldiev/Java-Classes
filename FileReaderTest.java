import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/Daniiar/Desktop/captmidn.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("/Users/Daniiar/Desktop/new.txt");
        writer.write(fileContent);
        writer.close();




    }



}
