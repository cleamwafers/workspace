public class 課題10 {
    public static void main(String[] args) {
    int speed = 120;
    int limit = 60;
 
    String message = speed > limit ? "スピード違反です。" : "法定速度内です。";
    System.out.println(message);

    int speed1 = 50;
    int limit1 = 60;
 
    System.out.println(speed1 > limit1 ? "スピード違反です。" : "法定速度内です。");
}
}
