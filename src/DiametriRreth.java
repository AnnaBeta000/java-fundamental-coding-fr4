import java.util.Scanner;
public class DiametriRreth { //ush 1
    public static void main ( String [] args) {
       Scanner scanner = new Scanner (System.in);

        System.out.println("Jep diametrin : " );
        float diametri = scanner.nextFloat();
        float rrezja = diametri / 2 ;

        double perimetri = (2*Math.PI*rrezja) ;
        float perimetri2 = (float) (2*Math.PI*rrezja); //kemi humbje vlerash kur perdorim float

        System.out.println("Perimetri double eshte :" +perimetri);
        System.out.println(" Permietri float eshte :" +perimetri2);
    }
}
