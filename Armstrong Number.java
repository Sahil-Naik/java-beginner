import java.util.Scanner;

public class armstrong {

    public static int get_cube(int k){
        return k*k*k;
    }

    public static void reverseArray(int[] array) {
        int start = 0; // Starting index
        int end = array.length - 1; // Ending index

        while (start < end) {
            // Swap the elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }
    }

    public static int[] add_ele(int n, int[] arr, int x){
        int i;
        //int[] newarr;

        if (n==0){
            int[] newarr = new int[1];
            newarr[0] = x;
            return newarr;
        } else {
            int[] newarr = new int[n+1];

            for (i=0; i<n; i++){
                newarr[i] = arr[i];
            }
            newarr[n] = x;
            return newarr;
        }
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter Number: ");

        int number = Integer.parseInt(myObj.nextLine());

        String numberAsString = String.valueOf(number);
        // Find the length of the string
        int length = numberAsString.length();

        int i;
        int sum = 0;
        int[] num_array = {};
        int n = 3;

        int temp = number;

        for (i=0; i<length; i++){
            int remain = temp%10;
            temp = temp/10;

            num_array = add_ele(i, num_array, remain);
        }

        reverseArray(num_array);

        //System.out.println(Arrays.toString(num_array));
        System.out.print("Cubes are: ");
        for (i=0; i<length; i++){
            //System.out.println("I is: "+i);
            sum = sum + get_cube(num_array[i]);
            if (i != length-1){
                System.out.print(get_cube(num_array[i])+"+");
            } else {
                System.out.print(get_cube(num_array[i]));
            }
        }
        //System.out.println("Number is: "+number);
        System.out.println("\nSum of cubes is: "+sum);

        if (sum == number){
            System.out.println("It is an Armstrong number!");
        } else {
            System.out.println("It is not an Armstrong number!");
        }
    }
}
