
import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {
        File file = new File("sample.txt");
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("delete successfully");
            } else {
                System.out.println("Unable to delete");
            }

        } else {
            System.out.println("File not found");
        }
    }
}
