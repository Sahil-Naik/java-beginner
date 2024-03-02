import java.util.Arrays;

public class missing_from_list_2 {

    public static void main(String[] args){
        int[] myarr = {1,4,3,8,5,9};
        // Assuming number range starts from 0 to x

        Arrays.sort(myarr);

        int last_num = myarr[(myarr.length)-1];

        //System.out.print(last_num);
        System.out.print("Array given is: "+ Arrays.toString(myarr));
        System.out.print("\nMissing numbers are: ");
        int current_index = 0;
        for (int i=0; i<last_num; i++){
            if (i==myarr[current_index]){
                current_index = current_index + 1;
            } else {
                System.out.print(i+" ");
            }
        }

    }
}
