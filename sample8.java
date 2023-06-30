public class sample8 {
    public static void main(String[]args){
    int point = 10;
    if (point >= 10) {
        System.out.println("great");
    }

    int sum = 0;
    if (sum >= 10){
        System.out.println("great");
    }else if(sum >= 7){
        System.out.println("good");
    }else if(sum >= 5){
        System.out.println("ok");
    }else{
        System.out.println("bad");
    }

    int num = 6;
    // numが10以上だったら処理
    if (num >= 10) {
        System.out.println("great");
    // numが7以上だったら
    } else if (num >= 7) { // 上の条件が合致しなければ処理
        System.out.println("good");
    // numが5以上だったら
    } else if (num >= 5) { // 立て続けに条件をかける
        System.out.println("ok");
    }

    // 親ブロックで宣言された変数str
    String str = null;
    int math = 10;
    if (math >= 10) {
        // 子ブロックで代入など利用可能
        str = "ok";
    }
    System.out.println(str); // okと画面に出力

    int number = 0;
    if (number >= 10){//10以上か？
        System.out.println("perfect");
    }else if (number >= 5 && number <=9 ){//5以上、9以下か？
        System.out.println("great");
    }else if (number >= 3 && number <=4){//3以上、4以下か？
        System.out.println("good");
    }else{//2以下か？
        System.out.println("bad");
        if (number == 0){
            System.out.println("やり直してください");
        }
    }
}
}
