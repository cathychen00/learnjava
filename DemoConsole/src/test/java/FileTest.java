import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author 陈敬
 * @date 17/11/30
 */
public class FileTest {

    @Test
    public void testFileWriter() {
        try {
            FileWriter writer = new FileWriter("testfile.txt");
            writer.write("hello world 1!");
            writer.write("hello world 11!");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPrintWriter() {
        try {
            PrintWriter writer = new PrintWriter("testfile.txt");
            writer.println("hello world 2!");
            writer.println("hello world 22!");

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
