package digitalexception;

public class DigitalException extends RuntimeException{

    private String digital;

    public String getDigital() {
        return digital;
    }
    public DigitalException (String message, String digital)
    {
        super(message);
        this.digital=digital;
    }
}
