package order;

public class RiderLostException extends RuntimeException {
  public RiderLostException(String message) {
    super(message);
  }
}
