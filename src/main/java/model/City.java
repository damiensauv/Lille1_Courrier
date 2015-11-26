package model;

import model.letter.*;

import java.util.ArrayList;
import java.util.List;

public class City {
    public String name;
    protected List<Inhabitant> inhabitants;
    protected PostBox postBox;

    /**
     * @param name the city name
     */
    public City(String name) {
        super();
        this.inhabitants = new ArrayList<Inhabitant>();
        this.postBox = new PostBox();
        this.name = name;
    }

    public PostBox getPostBox() {
        return postBox;
    }

    /**
     * generate inhabitants
     *
     * @param inhabitant the number of inhabitant you want to generate
     */
    public void generateInhabitants(int inhabitant) {
        int i = 0;
        while (i < inhabitant) {
            this.inhabitants.add(new Inhabitant(i + 1, this));
            i++;
        }
    }

    /**
     * @param max value of the random number
     * @return the random number
     */
    public int randomOfLettersInhabitants(int max) {
        return (int) (1 + (Math.random() * (max - 1)));
    }

    private Letter<?> createLetter() {
        int idSend;
        int idReceiv;
        int nbRadom;
        Letter<?> letter;
        idSend = this.randomOfLettersInhabitants(this.inhabitants.size() - 1);
        idReceiv = this.randomOfLettersInhabitants(this.inhabitants.size() - 1);

        nbRadom = this.randomOfLettersInhabitants(10);
        if ((nbRadom % 2) == 0)
            letter = new SimpleLetter(inhabitants.get(idSend), inhabitants.get(idReceiv), "BlaBla");
        else
            letter = new PromissoryNote(inhabitants.get(idSend), inhabitants.get(idReceiv), this.randomOfLettersInhabitants(300));

        nbRadom = this.randomOfLettersInhabitants(10);
        if ((nbRadom % 2) == 0)
            letter = new RegisteredLetter(letter.getSender(), letter.getReceiver(), (NotUrgentLetter) letter);

        nbRadom = this.randomOfLettersInhabitants(10);
        if ((nbRadom % 2) == 0)
            letter = new UrgentLetter(letter.getSender(), letter.getReceiver(), (NotUrgentLetter) letter);
        return letter;
    }

    /**
     * create and post a random number of letters
     */
    public void sendLetters() {
        int nbLetters = this.randomOfLettersInhabitants(10);

        for (int i = 0; i < nbLetters; i++) {
            Letter letter = createLetter();
            try {
                this.postBox.post(letter);
            } catch (CannotAffordLetterException e) {
                System.out.println(e.getMessage());
            }
        }
        postBox.newDay();
    }

    /**
     * post letters of the day
     */
    public void distributeLetters() {
        List<Letter<?>> postedLetters = new ArrayList<Letter<?>>();
        for (Letter l : postBox) {
            l.displayMessage();
            l.doAction();
            postedLetters.add(l);
        }
        postBox.posted(postedLetters);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

