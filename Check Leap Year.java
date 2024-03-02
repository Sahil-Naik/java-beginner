import java.util.Scanner;

public class check_leap_year {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Year: ");

        int year = Integer.parseInt(myObj.nextLine());  // Read user input

        if (year%4==0){
            System.out.println("It is a leap year!");
        } else {
            System.out.println("It is not a leap year!");
        }
    }
}
