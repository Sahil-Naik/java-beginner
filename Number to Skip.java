import java.util.Scanner;

public class skip_number {
        public static void main(String[] args){
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter range: ");
            int range = Integer.parseInt(myObj.nextLine());
            System.out.print("Number to skip: ");
            int skipper = Integer.parseInt(myObj.nextLine());

            int i;
            // Numbering starts from 1
            System.out.print("Numbers are: ");
            for (i=1; i<range+1; i++){
                if (i!=skipper && skipper <= range){
                    System.out.print(i+" ");
                } else if (i!=skipper && skipper > range){
                    System.out.print("Number to skip out of Range!");
                    break;
                } else {
                    continue;
                }
            }
        }
    }
