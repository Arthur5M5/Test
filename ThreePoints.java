import java.util.Scanner;

public class ThreePoints {
    public static boolean Points() {
        double x1, x2, x3, y1, y2, y3;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите координаты трех точек");
            System.out.println("Точка А(x1, y1)");
            while (sc.hasNext()) {
                if (sc.hasNextDouble()) {
                    x1 = sc.nextDouble();
                    y1 = sc.nextDouble();
                    System.out.println("Точка B(x2, y2)");
                    x2 = sc.nextDouble();
                    y2 = sc.nextDouble();
                    System.out.println("Точка С(x3, y3)");
                    x3 = sc.nextDouble();
                    y3 = sc.nextDouble();

                    if ((y3 - y1) / (y2 - y1) - (x3 - x1) / (x2 - x1) == 0) {
                        System.out.println("Данные точки расположены на одной прямой ");
                        return true;
                    } else {
                        System.out.println("Данные точки не расположены на одной прямой ");
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = ThreePoints.Points();
        System.out.println(result);
    }
}

