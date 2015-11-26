package model.letter;

import model.Inhabitant;

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

    public String contentInside()
    {
        return "a thanks letter which is a simple letter whose content is a text content (thanks for a Promissory note letter whose content is a money content of (" + this.content + ")) to "
                + this.getReceiver().getName();
    }

    @Override
    public void doAction()
    {
    }
}