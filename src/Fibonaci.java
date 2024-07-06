import java.util.Scanner;

public class Fibonaci {
    public static int fibonaci (int index) {
            if (index == 0 ) {
                return 0; }
                if ( index == 1 ) {
                    return 1; }

                int first= 0;
                int second= 1 ;

                for ( int i = 0; i < index - 1; i ++) {
                    int third= first + second ;
                    first=second;
                    second=third;
                }
                return second;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vendos numrin pozitiv te plote : ");
        int index = scanner.nextInt();
        if (index >= 0) {
            System.out.println(Fibonaci.fibonaci(index)+"");}
        else {
            System.out.println("Numri nuk eshte i sakte!");
        }
    }
    }



