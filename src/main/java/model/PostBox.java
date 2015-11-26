package model;

import model.letter.Letter;

import java.util.*;

/**
 * Created by svirchevsky on 26/11/15.
 */
public class PostBox implements Iterable<Letter<?>> {

    protected List<Letter<?>> currentDay = new ArrayList<Letter<?>>();
    protected List<Letter<?>> nextDay = new ArrayList<Letter<?>>();

    /**
     * post a letter
     * @param letter the letter to post
     * @throws CannotAffordLetterException if the sender cannot afford to send the letter
     */
    public void post(Letter letter) throws CannotAffordLetterException {
        BankAccount bankAccount = letter.getSender().getBankAccount();
        int letterCost = letter.getCost();
        if (bankAccount.getAmount() < letterCost) {
            throw new CannotAffordLetterException(letter.getSender(), bankAccount.getAmount(), letterCost);
        }
        bankAccount.debit(letterCost);
        this.nextDay.add(letter);
    }

    /**
     * Remove the letters of the current day
     * Put the remaining letters posted today.
     */
    public void newDay() {
        this.currentDay.addAll(this.nextDay);
        this.nextDay.clear();
    }

    @Override
    public Iterator<Letter<?>> iterator() {
        return currentDay.iterator();
    }

    public void posted(List<Letter<?>> l) {
        this.currentDay.removeAll(l);
    }
}
