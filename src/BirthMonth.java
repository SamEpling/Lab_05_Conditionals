import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int month = 0;
       String trash = "";
        System.out.print("Enter your birth month [1-12] : ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine();
            System.out.println("Your birth month is: " + month);
        }
        else {
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + trash);
        }

    }
}