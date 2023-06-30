public class 課題8 {
    public static void main(String[] args) {
        int number1 = 10;
        if (number1 == 5) {
            System.out.println("OK");
        }

        int number2 = 8;
        if (number2 == 3 || number2 == 5) {
            System.out.println("OK");
        } else if (number2 >= 11 && number2 < 15) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }
    }
}