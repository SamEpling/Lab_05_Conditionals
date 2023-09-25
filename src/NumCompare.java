import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int numOne = 0;
       int numTwo = 0;

        System.out.print("Enter the first number: ");

        if (in.hasNextInt()) {
            numOne = in.nextInt();
            in.nextLine();
            System.out.print("Enter the second number: ");
            if (in.hasNextInt()) {
                numTwo = in.nextInt();
                in.nextLine();
                if (numOne > numTwo) {
                    System.out.println(numTwo + " is less than " + numOne);
                }
                else if (numTwo == numOne) {
                    System.out.println(numTwo + " is equal to " + numOne);
                }
                else {
                    System.out.println(numOne + " is less than " + numTwo);
                }
            }
            else {
                System.out.println("You input an invalid number! Try again!");
            }
        }
        else {
            System.out.println("You input an invalid number! Try again!");
        }

        }}
