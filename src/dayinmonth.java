import java.util.Scanner;
public class dayinmonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap thang can kiem tra");
        int month = input.nextInt();
        switch (month){
            case(2):
                System.out.println("Thang " + month + " co 28 hoac 29 ngay");
                break;
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
                default:
                    System.out.println("Thang " + month + " co 30 ngay");
        }
    }
}
