//점이 사각형 안에 있는지 판별
import java.util.Scanner;
public class ch2_8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        return (x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");//첫번째 좌표
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");//두번째 좌표
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (inRect(x1, y1, 100, 100, 200, 200))
            System.out.println("(" + x1 + "," + y1 + ")는 사각형 안에 있습니다.");
        else
            System.out.println("(" + x1 + "," + y1 + ")는 사각형 안에 있지 않습니다.");

        if (inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("(" + x2 + "," + y2 + ")는 사각형 안에 있습니다.");
        else
            System.out.println("(" + x2 + "," + y2 + ")는 사각형 안에 있지 않습니다.");

        sc.close();

    }
}
