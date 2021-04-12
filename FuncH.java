import java.util.Scanner;

public class FuncH {
    public static void yFunc() {
        double a, b, x, h = 2;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Задайте область определения функции [a, b]:");
            a = sc.nextDouble();
            b = sc.nextDouble();

            for(x = a; x <= b; x += h)
                System.out.println(x);

        }
    }

    public static void main(String[] args) {
        FuncH.yFunc();
    }
}