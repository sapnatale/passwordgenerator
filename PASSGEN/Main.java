import javax.crypto.SecretKey;

public class Main {
     public static void main(String[] args) {
        try {
            // Generate a strong password
            String password = PasswordGenerator.generatePassword();
            System.out.println("Generated Password: " + password);

            // Encrypt the password
            SecretKey key = EncryptionUtil.generateKey();
            String encryptedPassword = EncryptionUtil.encrypt(password, key);
            System.out.println("Encrypted Password: " + encryptedPassword);

            // Encode the key
            String encodedKey = EncryptionUtil.encodeKey(key);

            // Save encrypted password and key to a file
            PasswordSaver.saveToFile(encryptedPassword, encodedKey, "password.txt");

            System.out.println("Encrypted password and key saved to password.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
