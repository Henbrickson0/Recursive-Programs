import java.util.*;

public class Recursive3 {

    public static void main(String[] args) {

        NoRepeating(3, "");
    }

    public static void NoRepeating (int length, String start)
    {

        if (start.length() == length)
        {
            System.out.println(start);
            return;
        }

        NoRepeating(length, start + "0");

        if (start.length()==0 || start.substring(start.length()-1).equals("0"))
        {
            NoRepeating(length, start + "1");
        }


        //System.out.println(start);

    }
}
