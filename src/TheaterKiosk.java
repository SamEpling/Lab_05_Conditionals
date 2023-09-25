import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int age = 0;
        System.out.print("How old are you? : ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            if (age >= 21) {
                System.out.println("You get a wrist band!");
            }
        }
        }}
