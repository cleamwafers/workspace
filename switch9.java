public class switch9 {
    public static void main (String[] args){
    int num = 5;

    switch (num){
        case 10:
            System.out.println("great");
            break;
        case 5:
            System.out.println("ok");
            break;
        default :
            System.out.println("bad");
            break;
    }

    int num1 = 10;

    switch (num1){
        case 10:
            System.out.println("great");
            break;
        case 5:
            System.out.println("ok");
            break;
        default :
            System.out.println("bad");
            break;
    }

    int num２ = 10;

    switch (num２){
        case 10:
        case 5:
            System.out.println("ok");
            break;
        default :
            System.out.println("bad");
            break;
    }
}
}
