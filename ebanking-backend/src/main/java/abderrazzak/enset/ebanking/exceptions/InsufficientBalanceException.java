package abderrazzak.enset.ebanking.exceptions;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String insufficientBalance) {
        super(insufficientBalance);
    }
}
