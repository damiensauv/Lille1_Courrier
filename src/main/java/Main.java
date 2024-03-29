import model.City;

/**
 * Created by damien on 23/11/15.
 */
public class Main {

    public  static void main(String[] args) {

        int nbDays = 6;
        int inhabitant = 100;

        // Create City
        City city = new City("Lille");
        System.out.println("Creating " + city.getName() + " city");

        // Create inhabitant
        city.generateInhabitants(inhabitant);

        System.out.println("Creating " + inhabitant + " inhabitants");
        System.out.println("Mailing letters for " + nbDays + " days");

        int i = 0;
        while (i < nbDays) {
            System.out.println("***********************************************");
            System.out.println("Day " + String.valueOf(i + 1));
            city.sendLetters();
            city.distributeLetters();
            i++;
        }
    }
}
