package exepitions;

public class InvalidIdExepition extends RuntimeException{
    public InvalidIdExepition(String message) {
        super("L'id inserito non è valido!");
    }
}
