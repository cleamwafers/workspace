public class sample6 {
    public static void main (String[]args){
    //型[] 変数名 = new 型[要素数];

    // int型、最大要素数が5の配列を宣言しました
    int[] nums = new int[5];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 4;
    nums[4] = 5;

    // 再代入も可能
    nums[4] = 10;

    // int型、要素は5個、 [0] => 1 [1] => 2 [2] => 3 [3] => 4 [4] => 5
    int[] nums2 = {1, 2, 3, 4, 5};
    System.out.println(nums2[1]);
    // String型、要素は3個、[0] => "a", [1] => "b", [2] => "c"
    String[] texts = {"a", "b", "c"};
    System.out.println(texts[1]);

    int[] nums1 = new int[4];
    nums1[0] = 1;
    nums1[1] = 3;
    nums1[2] = 5;
    nums1[3] = 7;

    System.out.println(nums1[0]); // 1
    System.out.println(nums1[1]); // 3
    System.out.println(nums1[2]); // 5
    System.out.println(nums1[3]); // 7

    System.out.println(nums.length); // 4
    }
}
