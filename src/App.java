import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a temperatura em graus Celsius:");
        double grauscel = sc.nextDouble();

        double fahr = (grauscel * 9 / 5) + 32;

        System.out.print("Essa é a temperatura em graus Fahrenheit: " + fahr);
    }
}