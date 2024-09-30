import java.util.ArrayList;

public class OtherFileHandler implements FileHandler{
    @Override
    public void readFile(String filePath) {
        System.out.println("Wrong file format!");
    }
}
