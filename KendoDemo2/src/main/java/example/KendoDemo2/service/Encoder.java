package example.KendoDemo2.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encoder {

    public Encoder() {
    }
    
    public static String encode ( String base){
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("SHA-256");
            final byte[] hash = digest.digest(base.getBytes(StandardCharsets.UTF_8));
        
            return String.valueOf(hash);
        } catch (NoSuchAlgorithmException e) {

            e.printStackTrace();
        }
        return null;

    }
}
