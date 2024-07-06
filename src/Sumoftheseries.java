import java.util.Scanner;
public class Sumoftheseries { //ush 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Jep numrin :");
        int n = scanner.nextInt();
        double sum = 0 ;
         for (int i = 1 ; i < n ; i++) {
             System.out.println("Shuma eshte : " +sum + "interracioni : " +i);
         sum = sum + (double) 1 / i ; }
        System.out.println(sum);
    }
}
