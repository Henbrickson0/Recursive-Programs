public class Recursive4 {

    public static void main(String[] args) {

    }

    public static void HalfEqual(int length, String start)
    {
        if (length == start.length() && RemoveZero(start).length() % 2 == 0)
        {
            System.out.println(start);
            return;
        }

        HalfEqual(length, start + "0");
        if (start.length() == 0 || start.substring(start.length()-1).equals("1"))
        {
            HalfEqual();
        }
    }

    public static String RemoveZero(String binary)
    {
        String noZero = "";
        if (binary.length() % 2 != 0)
        {
            binary = binary.substring(0, binary.length()/2) + binary.substring(binary.length()/2 + 1);
        }

        if (binary.indexOf("0") != -1)
        {
            binary.replaceAll("0","");
            return binary;
        }
        else
        {
            return binary;
        }
    }
}
