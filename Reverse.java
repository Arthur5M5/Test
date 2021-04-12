import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static String d;
    public static char a;
    public static char Rev(){
        try(BufferedReader fg = new BufferedReader(new InputStreamReader(System.in))) {
            d = fg.readLine();
            for (int i = d.length() - 1; i >= 0; i--) {
                a = d.charAt(i);
                System.out.println(a);
            }
        }catch (IOException e) {
            System.out.println("Ошибка ввода");
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(Reverse.Rev());
    }
}