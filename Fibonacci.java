import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {

    public static int[] add_ele(int n, int[] arr, int x){
        int i;
        int[] newarr = new int[n+1];
        for (i=0; i<n; i++){
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Range: ");

        int number = Integer.parseInt(myObj.nextLine());

        int[] fibo = {0,1};
        int i;

        System.out.print("The series is: ");

        for (i=2; i<number; i++){
            int last_element = fibo[(fibo.length)-1];
            int second_last_element = fibo[(fibo.length)-2];
            fibo = add_ele(i, fibo, (last_element+second_last_element));
        }

        System.out.println(Arrays.toString(fibo));
    }
}
