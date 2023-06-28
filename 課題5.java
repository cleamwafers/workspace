public class 課題5 {
     public static void main(String[] args) {
        int number1 = 103;
        int number2 = 105;
        boolean isOddNumber = false;
        // 比較演算結果の代入
        isOddNumber = (number1 + number2) % 2 == 1;

        System.out.println(isOddNumber);
    }
}
