import java.io.FileWriter;
import java.io.IOException;

public class PasswordSaver {
    public static void saveToFile(String encryptedPassword, String encodedKey, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("EncryptedPassword: " + encryptedPassword + "\n");
            writer.write("Key: " + encodedKey + "\n");
        }
    }
}