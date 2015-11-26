package model;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class CannotAffordLetterException extends Throwable {

    Inhabitant receiver;
    int amount;
    int letterCost;


    public CannotAffordLetterException(Inhabitant receiver, int amount, int letterCost) {
        this.receiver = receiver;
        this.amount = amount;
        this.letterCost = letterCost;
    }

    @Override
    public String getMessage() {
        return receiver.getName() + " cannot afford to send the letter. BankAccount amount:" + amount + " Letter cost: " + letterCost;
    }
}
