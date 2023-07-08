public class for文 {
    public static void main(String[]args){
        for (int i = 0; i < 5; i++){
            System.out.println(1);
        }
        for (int h = 0; h < 10; h++){
            System.out.println(2);
        }
         for (int j = 0; j < 5; j++){
            System.out.println(j);
        }
        for (int k = 0; k < 10; k++) {
            // iが奇数だった場合のみ出力します
            if (k % 2 != 0) {
                System.out.println(k + " ");
            }
        }
        // 加算
        for (int l = 0; l < 100; l += 10) {
            System.out.println(l + " ");
        }
        // 出力内容) 0 10 20 30 40 50 60 70 80 90

        // 減算
        for (int m = 10; m> 0; m -= 2) {
            System.out.println(m + " ");
        }
        // 出力内容) 10 8 6 4 2

        // 乗算
        for (int o = 1; o < 100; o *= 2) {
            System.out.println(o + " ");
        }
        // 出力内容) 1 2 4 8 16 32 64

        // 除算
        for (int p = 100; p > 0; p /= 10) {
            System.out.print(p + " ");
        }
        // 出力内容) 100 10 1
    }
}
