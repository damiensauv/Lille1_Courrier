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
        city.generateInhabitant(inhabitant);

        System.out.println("Creating " + inhabitant + " inhabitants");
        System.out.println("Mailing letters for " + nbDays + " days");


        // loop nb days
            //action Receives
            // action Send


    }


}





































