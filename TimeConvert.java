import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConvert{

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
         int n = s.length();
         int hour = 0;
         String h = "";
         String t = s.substring(n-2);

         s = s.replace("PM","");
         s = s.replace("AM","");
         String[] time = s.split(":", 3);

        hour = Integer.parseInt(time[0]);
        if(t.equalsIgnoreCase("PM")){
            if(hour==12){
                h = String.valueOf(hour);
            }
            else{
                hour += 12;
                h = String.valueOf(hour);
            }
        }
        else{
            if(hour==12){
                h = "00";
            }
            else{
                h = String.valueOf(hour);
                h = "0"+h;
            }
        }

        return h+":"+time[1]+":"+time[2];
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
