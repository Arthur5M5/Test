import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a, b;

        System.out.println("Введите 2 числа, представляющих углы предполагаемого треугольника ");

        try (Scanner sc = new Scanner(System.in);) {
            while (sc.hasNextDouble()) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                if (a + b < 180)
                    System.out.println("Треугольник существует ");
                else
                    System.out.println("Треугольник не существует ");
                if (a == 90 || b == 90 || a + b == 90)
                    System.out.println("Треугольник прямоугольный");
            }

        }
    }
}
