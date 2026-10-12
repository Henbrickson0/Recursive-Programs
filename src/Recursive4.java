public class Recursive4 {

    public static void main(String[] args) {
        HalfEqual(2,"");
    }

    public static void HalfEqual(int length, String start)
    {
        if (length == start.length() && RemoveZero(start).length() % 2 == 0)
        {
            System.out.println(start);
            return;
        }

        HalfEqual(length, start + "01");
        if (start.length() == 0 || start.substring(start.length()-1).equals("1"))
        {
           HalfEqual(length, start + "1");
        }
    }

    public static String RemoveZero(String binary)
    {
        String noZero = binary;
        if (binary.length() % 2 != 0)
        {
            noZero = binary.substring(0, binary.length()/2) + binary.substring(binary.length()/2 + 1);
        }


        noZero = noZero.replace("0","");

        return noZero;

    }
}
