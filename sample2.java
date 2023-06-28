public class sample2 {
    public static void main (String[] args){
    // 加算 ... 足し算
    int addition = 3 + 3; // 6
    // 減算 ... 引き算
    int subtract = 3 - 3; // 0
    // 乗算 ... 掛け算
    int multiplication = 3 * 3; // 9
    // 除算 ... 割り算
    int division = 3 / 3; // 1
    // 剰余算 ... あまり算
    int residueCalculation = 3 % 3; // 0
    // キャストなし
    System.out.println(2 / 3);         // 0

    // double型へのキャスト
    System.out.println(2 / (double) 3); // 0.6666666666666666
    System.out.println((double) 2 / 3); // 0.6666666666666666

    // float型へのキャスト
    System.out.println((float) 2 / 3);  // 0.6666667
    System.out.println(2 / (float) 3);  // 0.6666667

    // double型の値を計算に組み込む
    System.out.println(2 / 3.0);

    // float型の値を計算に組み込む
    System.out.println(2 / 3f);
    
    int num1 = 2;
    // 加算
    System.out.println(num1 += 3); // 5
    // 減算
    System.out.println(num1 -= 1); // 4
    // 乗算
    System.out.println(num1 *= 3); // 12
    // 除算
    System.out.println(num1 /= 2); // 6
    // 剰余算
    System.out.println(num1 %= 5); // 1

    int num2 = 5;

    // 前置インクリメント
    System.out.println(++num2); // 6
    // 後置インクリメント
    System.out.println(num2++); // 7
    // 前置デクリメント
    System.out.println(--num2); // 6
    // 後置デクリメント
    System.out.println(num2--); // 5
    int num2 = 5;

    // この行だけ画面に出力後、加算される
    System.out.println(num2++); // 5
    System.out.println(num2); // 6
    System.out.println(++num2); // 7
    }
}
