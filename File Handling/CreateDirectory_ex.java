
import java.io.File;

public class CreateDirectory_ex {

    public static void main(String[] args) {
        File folder = new File("C:\\github_project\\learning_java\\text.core");
        if (folder.mkdir()) {
            System.out.println("Folder created successfilly");
        } else {
            System.out.println("Folder already Exits or failed ");
        }
    }
}
