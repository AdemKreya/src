package FlightBooking.Exception;

public class FlightNotFoundException extends RuntimeException{

    public FlightNotFoundException(String message){
        super(message);
    }
}
