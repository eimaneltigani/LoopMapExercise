import java.util.*;
import java.util.Scanner;

public class carDealer {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        HashMap<String, String> carMap = new HashMap<>();
        carMap.put("A-Class", "Mercedes-Benz");
        carMap.put("A3", "Audi");
        carMap.put("Acadia", "GMC");
        carMap.put("Accord", "Honda");
        carMap.put("Altima", "Nissan");
        carMap.put("Arteon", "Volkswagen");
        carMap.put("Ascent", "Sabaru");
        carMap.put("Atlas", "Volkswagen");
        carMap.put("Avalon", "Toyota");

        System.out.println("What car model are you looking for?");
        String customerCar = input.nextLine();

        if (carMap.containsKey(customerCar) == true) {
            String customerModel = carMap.get(customerCar);
            System.out.println("Oh, you're looking for a " + customerCar + "? Our " + customerModel + " is right over here...");
        } else {
            System.out.println("Sorry we don't have that model available!");
        }

        input.close();
    }
}