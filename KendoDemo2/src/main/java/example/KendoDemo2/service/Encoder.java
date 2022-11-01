package example.KendoDemo2.service;


public class Encoder {

    public Encoder() {
    }
    
    public static String encode ( String base){
        String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(base);   
        return sha256hex;
    }
}
