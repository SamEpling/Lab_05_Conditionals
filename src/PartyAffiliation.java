import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party affiliation: [R/D/I] : ");
        String choice = in.nextLine();
        if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        }
        else if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (choice.equals("I")) {
            System.out.println("You get a Independent Man!");
        }
        else {
            System.out.println("You did not choose one of the three options!");
        }


    }
}