import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        do {
            System.out.println("Nhap thang muon kiem tra: ");
            month = scanner.nextInt();
            switch (month){
                case 2:
                    System.out.println("Thang " + month + "co 28 ngay");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Thang " + month + " co 31 ngay");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Thang " + month + " co 30 ngay");
                    break;
                default:
                    System.out.println("Khong co thang " + month);
                    break;
            }
        }while (month > 0 || month < 13);

    }
}