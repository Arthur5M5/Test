import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {
    static final double OneHour = (double)1 / 3600;
    static final double OneMin = (double)1 / 60;
    public static void Timer() {
        double x = 0;
        String g = "";
        try(BufferedReader fg = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите любое натуральное число");
            g = fg.readLine();
            try {
                x = Double.parseDouble(g);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
            }
        }catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
        double h = x * OneHour;
        double m = x * OneMin;
        System.out.print("Вы прошли: ");
        System.out.printf("%.1f", h);
        System.out.print("Ч\t");
        System.out.printf("%.1f", m);
        System.out.println("Мин\t");
        System.out.printf("%.1f", x);
        System.out.println("c\t");
    }

    public static void main(String[] args) {
        Time.Timer();
    }
}
