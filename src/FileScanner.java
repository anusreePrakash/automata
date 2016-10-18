import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileScanner {

    public void scanFile() throws IOException {
        String entireFileText = new Scanner(new File("/Users/anusree/workspace/dfa/src/test_data.json"))
                .useDelimiter("\\A").next();
        String my_new_str = entireFileText.replace("\\", "");
        String substring = my_new_str.substring(1, my_new_str.length() - 1);

        Path fileToDeletePath = Paths.get("/Users/anusree/workspace/dfa/dataString.json");
        Files.deleteIfExists(fileToDeletePath);

        PrintWriter writer = new PrintWriter("dataString.json", "UTF-8");
        writer.println(substring);
        writer.close();
    }
}
