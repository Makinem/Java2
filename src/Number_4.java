import java.util.Scanner;
public class Number_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        boolean sameRowOrColumn = (x1 == x2) || (y1 == y2);
        boolean sameDiagonal = Math.abs(x1 - x2) == Math.abs(y1 - y2);
        if (sameRowOrColumn || sameDiagonal) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
