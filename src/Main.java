import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("""
                Conversor de temperatura.
                Digite o valor em C°:""");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();

        /*Celsius → Fahrenheit (°F)
        Fórmula: °F = (°C × 1,8) + 32*/
        double fahrenheit = (celsius * 1.8) + 32;

        /*Celsius → Kelvin (K)
        Fórmula: K = °C + 273,15*/
        double kelvin = celsius + 273.15;

        System.out.printf("""
                %.2f°C
                %.2f°F
                %.2fK
                """, celsius, fahrenheit, kelvin);
    }
}