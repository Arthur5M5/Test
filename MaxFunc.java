import java.util.Scanner;

interface MinF {
    int Min(int a, int b);
}
interface MaxF {
    int Max(int a, int b);
}
class MaxFunc {
    public static void main(String[] args) {
        MinF min = (a, b) -> {
            if(a < b)
                return a;
            else
                return b;
        };
        MaxF max = (a, b) -> {
            if(a > b)
                return a;
            else
                return b;
        };

        try(Scanner sc = new Scanner(System.in)) {
            int i, j, x, h;
            System.out.println("Введите четыре числа ");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                j = sc.nextInt();
                System.out.println("Вы ввели " + i + " " + "и" + " " + j);
                System.out.println("Минимальное значение: " + min.Min(i, j));
                x = sc.nextInt();
                h = sc.nextInt();
                System.out.println("Вы ввели " + x + " " + "и" + " " + h);
                System.out.println("Минимальное значение: " + min.Min(x, h));
                System.out.println("Максимальное значение обеих аргументов: " + Math.max(min.Min(i, j), min.Min(x, h)));

            }
        }

    }
}

