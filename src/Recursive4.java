public class Recursive4 {

    public static void main(String[] args) {
        HalfEqual(2,"");
    }

    public static void HalfEqual(int length, String start)
    {
        if (start.length() == length && RemoveZero(start.substring(0, length/2 + length % 2)).equals(RemoveZero(start.substring(length/2))))
        {
            System.out.println(start);
        }
        if (length == start.length())
        {
            return;
        }

        HalfEqual(length, start + "0");
        HalfEqual(length, start + "1");

    }

    public static String RemoveZero(String binary)
    {
        String noZero = binary;

        noZero = noZero.replace("0","");

        return noZero;

    }
}
