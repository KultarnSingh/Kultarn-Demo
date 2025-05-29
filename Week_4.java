import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Week_4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("Kultarn.txt", true);
        PrintWriter writer = new PrintWriter(fw);

        System.out.println("Enter text to write to the file (type 'exit' to stop):");
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("exit")) {
            writer.println(input);
        }
            // comments
        writer.close();
        scanner.close();
        System.out.println("Done writing to the file!");
    }
}
