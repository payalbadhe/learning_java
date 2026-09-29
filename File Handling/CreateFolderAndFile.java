
import java.io.File;

public class CreateFolderAndFile {

    public static void main(String[] args) {
        try {
            File folder = new File("C:\\github_project\\text-file");
            if (!folder.exists()) {
                folder.mkdir();
            }
            File file = new File(folder, "");
            if (file.createNewFile()) {
                System.out.println("created successfully" + file.getAbsolutePath());
            } else {

                System.out.println("file already exits");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
