import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double vlera = llogari();
        System.out.print("Vlera eshte : " + vlera);
    }

    public static double llogari() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendos numrin e pare : ");
        float number1 = scanner.nextFloat();
        System.out.println("Vendos simbolin : ");
        char symbol = scanner.next().charAt(0);
        System.out.println("Vendos numrin e dyte : ");
        float number2 = scanner.nextFloat();

        switch (symbol) {
            case '+':
                return number1 + number2;

            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;


            case '/':
                if (number2 == 0) {
                    System.out.println("Pjestimi me 0 nuk ka kuptim");
                    return Integer.MIN_VALUE;
                } else {
                    return number1 / number2;
                }
            default:
                System.out.println("Invalid ! ");
        }
        return Integer.MIN_VALUE;
    }
}







