public class sample4 {
    public static void main (String[] args){
        int num = 5;
        boolean flg = false;

        System.out.println(num == 5); //true
        System.out.println(num != 5); //false
        System.out.println(flg == true); //false
        System.out.println(flg != true); //true

        System.out.println(num < 5); //false
        System.out.println(num <= 5); //true
        System.out.println(num > 5.44); //false
        System.out.println(num >= 5.1f); //false

        String str1 = "ab";
        String str2 = "ab";
        String str3 = "cd";

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false
    }
}
