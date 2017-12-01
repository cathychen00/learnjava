import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author 陈敬
 * @date 17/11/30
 */
public class FileTest {

    @Test
    public void testWriteFile() {
        try {
            FileWriter writer = new FileWriter("testfile.txt");
            writer.write("hello world!");
            writer.write("hello world 11!");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReadFile() {
        try {
            Scanner in = new Scanner(Paths.get("testfile.txt"));
            while (in.hasNext()) {
                System.out.println(in.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
