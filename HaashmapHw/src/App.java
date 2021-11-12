import java.util.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number- ");
        int a = input.nextInt();
        System.out.print("Enter second number- ");
        int b = input.nextInt();
        System.out.print("Enter third number- ");
        int c = input.nextInt();
        System.out.print("Enter fourth number- ");
        int d = input.nextInt();
        System.out.print("Enter fifth number- ");
        int e = input.nextInt();

        // create array list of integers
        ArrayList<Integer> intArray = new ArrayList<Integer>(5);
        intArray.add(a);
        intArray.add(b);
        intArray.add(c);
        intArray.add(d);
        intArray.add(e);

        int min = Collections.min(intArray);
        int max = Collections.max(intArray);
        
        // method for sum of elements in array
        int sum = 0;
        int i;

        for (i=0; i < intArray.size(); i++) {
            sum += intArray.get(i);
        }

        // method for product of elemnts in array
        int product = 1;

        for (i=0; i < intArray.size(); i++) {
            product *= intArray.get(i);
        }

        // Prints sum, prouct, largest, and smallest of numbers
        System.out.println("The minimum number is: " + min);
        System.out.println("The largest number is: " + max);
        System.out.println("The sum of your numbers is: " + sum);
        System.out.println("The product of your numbers is: " + product);
    }
}
