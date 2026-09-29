import java.util.Scanner;
public class Number_2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}