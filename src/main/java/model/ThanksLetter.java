package model;

/**
 * Created by damien on 26/11/15.
 */
public class ThanksLetter extends NotUrgentLetter<String>
{
    public ThanksLetter(Inhabitant sender, Inhabitant receiver, String content){
        super(sender, receiver);
        this.cost = 1;
        this.content = content;
    }

    public String displayInside()
    {
        return " a thanks letter which is a simple letter whose content is a text content (thanks for a Promissory note letter whose content is a money content of (" + this.content + ")) to "
                + this.getReceiver().getName();
    }

    @Override
    public void displaySend(){

        System.out.println("-> " + this.getSender().getName() + " mails " + this.displayInside()
                +  " to " + this.getReceiver().getName() + " for a cost of " + this.getCost() + " euros");

        this.getSender().getBankAccount().debit(this.getCost());

        System.out.println(" - " + this.getCost() + " euros are debited from " + this.getSender().getName() + " account whose balance is now "
                + this.getSender().getBankAccount().getAmount() + " euros");

    }

    @Override
    public void doAction()
    {
        System.out.println("<- " + this.getReceiver().getName() + " receives " + this.displayInside() + " from "+ this.getSender().getName());

    }
}