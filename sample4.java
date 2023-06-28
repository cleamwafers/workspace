public class sample4 {
    public static void main (String[] args){
        int num = 5;
        boolean flg = false;
        double d = 5.5;
        float f = 10.1f;
        String strNum = "5";
        String strD = "5.5";
        String strF = "10.1f";

        System.out.println(num == 5); //true
        System.out.println(num != 5); //false
        System.out.println(flg == true); //false
        System.out.println(flg != true); //true

        System.out.println(num < 5); //false
        System.out.println(num <= 5); //true
        System.out.println(num > 5.44); //false
        System.out.println(num >= 5.1f); //false

        // intに変換
        System.out.println(num == Integer.parseInt(strNum)); // true
        // doubleに変換
        System.out.println(d == Double.parseDouble(strD)); // true
        // floatに変換
        System.out.println(f == Float.parseFloat(strF)); // true

        String str1 = "ab";
        String str2 = "ab";
        String str3 = "cd";

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false
    }
}
