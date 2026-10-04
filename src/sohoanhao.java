import java.util.Scanner;

public class sohoanhao {

    // Hàm kiểm tra một số có phải số hoàn hảo không
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }

        int tong = 0;
        // Tìm các ước thực sự từ 1 đến n - 1
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }

        // Tổng các ước bằng chính n => là số hoàn hảo
        return tong == n;
    }

    // Hàm thực hành gom Nhập -> Xử lý -> In ra
    public static void printResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int n = scanner.nextInt();

        if (isPerfectNumber(n)) {
            System.out.println(n + " là số hoàn hảo.");
        } else {
            System.out.println(n + " không phải là số hoàn hảo.");
        }
    }
}