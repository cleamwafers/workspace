public class 課題9 {
    public static void main(String[] args) {
        int number13 = 8;
        int number14 = 2;
        int differenceNumber = number13 - number14;

        switch (differenceNumber % 2) {
            case 0:
                System.out.println("偶数か0です");
                break;
            case 1:
                System.out.println("奇数です");
                break;
        }
    }
}
