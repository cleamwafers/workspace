public class sample7 {
    public static void main (String[] args){
    // 多次元配列の宣言// 親
    int[][] nums = new int[3][];
    // 要素数を確保します// これらは全て子です
    nums[0] = new int[2]; 
    nums[1] = new int[3];
    nums[2] = new int[4];
    nums[0][0] = 1;
    nums[0][1] = 2;
    nums[1][0] = 3;
    nums[1][1] = 4;
    nums[1][2] = 5;
    nums[2][0] = 6;
    nums[2][1] = 7;
    nums[2][2] = 8;
    nums[2][3] = 9;

    System.out.println(nums[0][0]); // 1
    System.out.println(nums[0][1]); // 2
    System.out.println(nums[1][0]); // 3
    System.out.println(nums[1][1]); // 4
    System.out.println(nums[1][2]); // 5
    System.out.println(nums[2][0]); // 6
    System.out.println(nums[2][1]); // 7
    System.out.println(nums[2][2]); // 8
    System.out.println(nums[2][3]); // 9
    int[][] nums1 = {
    {1, 2},
    {3, 4, 5},
    {6, 7, 8, 9}
    };
    System.out.println(nums1[0][0]); // 1
    System.out.println(nums1[0][1]); // 2
    System.out.println(nums1[1][0]); // 3
    System.out.println(nums1[1][1]); // 4
    System.out.println(nums1[1][2]); // 5
    System.out.println(nums1[2][0]); // 6
    System.out.println(nums1[2][1]); // 7
    System.out.println(nums1[2][2]); // 8
    System.out.println(nums1[2][3]); // 9

    // 親の要素数を取得します
    System.out.println(nums.length); // 3

    // 子の要素数を取得します
    System.out.println(nums[0].length); // 2
    System.out.println(nums[1].length); // 3
    System.out.println(nums[2].length); // 4

        // 三次元の配列です
    int[][][] nums2 = new int[3][][];
    nums2[0] = new int[2][];
    nums2[0][0] = new int[3];
    nums2[0][1] = new int[4];
    nums2[0][0][0] = 1;
    nums2[0][0][1] = 2;
    nums2[0][0][2] = 3;
    nums2[0][1][0] = 4;
    nums2[0][1][1] = 5;
    nums2[0][1][2] = 6;
    nums2[0][1][3] = 7;
    /* 以降の要素の確保は割愛 */

    System.out.println(nums2[0][0][0]);//1

    int[][][] nums3 = {
    {
        {1, 2, 3},
        {4, 5, 6, 7}
    },
    /* 多次元配列が続く... */
    };
     System.out.println(nums3[0][0][0]);//1
    }
}