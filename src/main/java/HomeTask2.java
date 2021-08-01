import org.w3c.dom.ls.LSOutput;

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println(compareDigits(14, 5));
        System.out.println(checkOfDigits(4));
        System.out.println(checkOfDigitsBool(-4));
        printLines("Ex",5);
    }

    public static boolean compareDigits(int a, int b) {
        return a + b >= 20;
    }

    public static String checkOfDigits(int a) {
        String result;
        if (a >= 0) {
            result = "Передано положительное число";
        }
        else result = "Передано отрицательное число";

        return result;
    }

    public static boolean checkOfDigitsBool(int a) {
        return a < 0;
    }

    public static void printLines(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }


}
