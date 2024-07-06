public class Bmi { //ush 2
    public static void main ( String [] args) {

        float weight = 60f;
        int height1 = 165;
        float heightf = 165/100f;
        System.out.println(heightf);
        double height = (double) heightf;

        height= (double) Math.pow(heightf,2);
        double bmi = weight / height ;

        if ( bmi>=18.5 && bmi<=24.9 ) {
            System.out.println("Bmi optimal : " + bmi);
        }
        else {
            System.out.println("Bmi not optimal : " + bmi);
        }
    }
}
