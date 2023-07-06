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

        int number3 = 10;
        int number4 = 5;
        boolean isOddNumber = false;
        // 比較した結果をそのまま代入
        isOddNumber = (number3 + number4) % 2 == 1;

        if (isOddNumber) {
            System.out.println("奇数です");
        } else {
            System.out.println("偶数です");
        }

        int number5 = 6;
        int number6 = 8;
        // 計算結果を複数回利用するので変数宣言する
        int product = (number5 * number6);

        if (product % 3 == 0 && product % 5 == 0) {
            System.out.println("3と5の倍数です");
        }

        int number7 = 4;
        int number8 = 5;
        int product1 = (number7 * number8);

        if (product1 % 2 == 0 || product1 % 3 == 0) {
            System.out.println("2か3の倍数です");
        }

        int number9 = 6;
        int number10 = 7;
        // 偶数と奇数の組み合わせなので足し合わせた結果が奇数か確認する
        int sum = number9 + number10;

        if (sum % 2 == 1) {
            System.out.println("偶数と奇数の組み合わせです");
        }

        int number11 = 8;
        int number12 = 8;
        int differenceNumber = number11 - number12;

        if (differenceNumber == 0) { // 先に0の確認を済ませる
            System.out.println("0です");
        } else if (differenceNumber % 2 == 0) {
            System.out.println("偶数です");
        } else { // 0と偶数の確認を済ませたあと残るのは奇数のみ
            System.out.println("奇数です");
        }
    }
    }
    