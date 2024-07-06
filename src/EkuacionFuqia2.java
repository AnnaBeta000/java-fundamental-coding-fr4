import java.util.Scanner;
public class EkuacionFuqia2 { //ush 3
    public static void main ( String [] args ) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Jep vleren a : ");
        int a = scanner.nextInt ();

        System.out.println("Jep vleren b : ");
        int b = scanner.nextInt ();

        System.out.println("Jep vleren c : ");
        int c = scanner.nextInt ();

        double dallori = Math.pow(b,2) - 4*a*c;


        if ( dallori > 0 ) {
            double x1 = -b - Math.sqrt(dallori) / 2 * a;
            double x2 = -b + Math.sqrt(dallori) / 2 * a;
            System.out.println("X1 eshte : " + x1);
            System.out.println("X2 eshte : " + x2);
        }

        else if (dallori == 0) {
            double x1 = -b - Math.sqrt(dallori) / 2 * a;
            System.out.println("X1==X2,ekuacioni ka nje rrenje : " + x1);
        }

        else {  // (dallori < 0)
            System.out.println("Dallori eshte negativ");
        }
    }
}
