public class MyOwnException extends IllegalArgumentException {
    public MyOwnException() {
        super();
    }
    
    public MyOwnException(String message) {
        super(message);
    }
}
