import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ResourceManager {

    private static BufferedReader reader;

    //reads the .txt files containing floor information
    public static ArrayList<String> readFloorFile(String filename) {
        System.out.println("[Resource Manager]Reading "+filename);

        ArrayList<String> strings = new ArrayList<String>();

        try {
            reader = new BufferedReader(new FileReader(filename));

        } catch (FileNotFoundException e) {
            System.out.println("[Resource Manager][Error]File " + filename + " not found.");
        }

        try {
            String str = reader.readLine();
            strings.add(str);

            while(str != null) {
                str = reader.readLine();
                strings.add(str);
            }
        } catch (IOException e) {
            System.out.println("[Resource Manager][Error]IOException.");
        }

        return strings;
    }
}
