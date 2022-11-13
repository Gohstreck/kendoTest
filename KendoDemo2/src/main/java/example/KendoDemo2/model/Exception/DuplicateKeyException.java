package example.KendoDemo2.model.Exception;

public class DuplicateKeyException extends Exception {
    
    public DuplicateKeyException(String message, Throwable error){
        super(message, error);

    }
}
