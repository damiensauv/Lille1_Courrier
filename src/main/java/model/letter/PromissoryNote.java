package model.letter;


import model.CannotAffordLetterException;
import model.Inhabitant;

public class PromissoryNote extends NotUrgentLetter<Integer> {
    public PromissoryNote(Inhabitant sender, Inhabitant receiver, int content) {
        super(sender, receiver);
        double tmp = ((double) content) * 0.01;
        this.cost = 1 + (int) tmp;
        this.content = content;
    }

    @Override
    public void doAction() {
        if (getSender().getBankAccount().getAmount() >= getContent()) {
            Letter<?> thankYouLetter = new ThanksLetter(this.getReceiver(), this.getSender(), String.valueOf(this.getContent()));
            getSender().getBankAccount().debit(getContent());
            getReceiver().getBankAccount().credit(getContent());
            System.out.println(" + " + getReceiver().getName() + " is credited with " + getContent() + " euros; its balance is now " + getReceiver().getBankAccount().getAmount() + " euro");
            try {
                this.getSender().getCity().getPostBox().post(thankYouLetter);
            } catch (CannotAffordLetterException e) {
                System.out.println(e.getMessage());
            }
        }
        else
            System.out.println("no enough money");
    }

    @Override
    public String contentInside() {
        return "a promissory note letter whose content is a money (" + this.getContent() + ")";
    }
}

