package fowox.spring.sfgpetclinic;

public class DataLayerException extends RuntimeException{
    public DataLayerException() {
        super();
    }

    public DataLayerException(String message) {
        super(message);
    }

    public DataLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}
