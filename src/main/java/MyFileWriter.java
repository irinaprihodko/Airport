import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

    public static void writeTextToFile(String text) {
        try (FileWriter writer = new FileWriter("airport.txt", false)) {
            writer.write(text);
            writer.append('\n');
        } catch (IOException ex) {
            System.out.println( "Text error");
        }

    }

}
