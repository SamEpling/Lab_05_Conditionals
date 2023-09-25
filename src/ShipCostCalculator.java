import java.util.Scanner;
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cost = 0;
        System.out.print("Input the cost of the item: ");

        if (in.hasNextDouble()) {
            cost = in.nextDouble();
            in.nextLine();
        }
        if (cost >= 100) {
            System.out.println("Your shipping is free and your cost is " + cost);
        } else {
            System.out.println("Your shipping is " + (.02 * cost) + " and your total cost is " + (cost * 1.02));
        }

    }
}