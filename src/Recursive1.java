
public class Recursive1 {
    public static void main(String[] args) {
        Recursive1 test = new Recursive1();
        DigitGenerator(2);
    }

    public static void DigitGenerator(int n) {
        GeneratorHelper(0,n );
    }


    public static void GeneratorHelper(int current, int length) {
       if (current > 0 && (current + "").length() == length)
       {
           System.out.println(current);
           return;
       }

       for (int i = current % 10 + 1; i<=9; i++)
       {
           GeneratorHelper(current*10 + i, length);
       }

    }

}