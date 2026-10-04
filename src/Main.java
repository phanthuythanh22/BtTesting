import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== DANH SÁCH BÀI TẬP ======");
        System.out.println("1. Kiểm tra Số Nguyên Tố");
        System.out.println("2. Kiểm tra Số Hoàn Hảo");
        System.out.println("===============================");
        System.out.print("Nhập số để một mục bất kỳ: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n--- BÀI 1: SỐ NGUYÊN TỐ ---");
                SNT.printResult();
                break;
            case 2:
                System.out.println("\n--- BÀI 2: SỐ HOÀN HẢO ---");
                sohoanhao.printResult();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }
}