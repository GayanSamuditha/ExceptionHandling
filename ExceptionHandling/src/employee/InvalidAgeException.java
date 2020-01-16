package employee;

public class InvalidAgeException extends Exception{

    String message;

    InvalidAgeException(String message)
    {
        super(message);
        this.message=message;
    }
}