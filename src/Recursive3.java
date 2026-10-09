import java.util.*;

public class Recursive3 {

    public static void main(String[] args) {
     NoRepeating(4, "0000");
    }

    public static void NoRepeating (int length, String start)
    {


        if (start.length() < length)
        {
           // NoRepeating(length, start+"0");
            start  = start + "0";

        }
        else if ((!(start.length() > length)))
        {
            System.out.println(start);
            NoRepeating(length, start.substring(length-2) +
                    Math.abs(Integer.parseInt(start.substring(length-1)) - 1));
        }

        //System.out.println(start);

    }
}
