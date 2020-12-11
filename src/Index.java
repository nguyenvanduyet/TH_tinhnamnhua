import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "là năm nhuận");
        }else {
            System.out.println(year+"là năm không nhuận");
        }
    }
}
