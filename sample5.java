public class sample5 {
    public static void main(String[]args){
        int num1 = 5;
        int num2 = 4;

        // 論理積 ... 1つ目がTRUE且つ、2つ目がTRUEかどうか
         System.out.println(num1 >= 5 && (num1 + num2) >= 10); // false
         System.out.println(num1 >= 5 && (num1 + num2) > 7); // true

         // 論理和 ... 1つ目がTRUEまたは、2つ目がTRUEかどうか
        System.out.println(num1 >= 5 || num2 >= 10); // true
        System.out.println(num1 < 5 || num2 == 4); // true
        System.out.println(num1 < 5 || num2 >= 10); // false

        // 否定 ... booleanの反転を行う
        boolean flg3 = false;
        boolean flg4 = true;
        System.out.println(!flg3); // true
        System.out.println(!flg4); // false
        System.out.println(!(flg3 == true)); // true
        System.out.println(!(flg4 == true)); // false

        // 他の論理演算と組み合わせることもあります
        System.out.println(!(flg3 == true && flg4 == true)); // true
        System.out.println(!(flg3 == true || flg4 == true)); // false
    }
}
