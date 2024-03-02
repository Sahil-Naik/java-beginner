import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class address_breaking {

    public static void main(String[] args) {
        String contact_info = "me123@gmail.com 1234567890 654";
        int i;

        // Valid email = containing '@' and '.'
        // Valid phone number = Length is 10

        String user_email = null;
        String user_phone = null;

        String regex = "\\b\\d{10}\\b";
        Pattern pattern = Pattern.compile(regex);


        String[] parts = contact_info.split(" ");

        for (i=0; i<parts.length; i++){
            String temp = parts[i];
            if (temp.contains("@")){
                user_email = parts[i];
            } else {
                Matcher matcher = pattern.matcher(temp);
                if (matcher.find()){
                    user_phone = temp;
                }
            }

        }

        System.out.println("Email: "+user_email);
        System.out.println("Phone number: "+user_phone);
    }
}
