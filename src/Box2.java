public class Box2 {
    public static void main(String[] args) {

        Box box = new Box ( 1.6 , 5.2 , 10) ;
        Box box2 = new Box ( 1.5,1.2,5) ;

       double gjatesia = box.gjatesia;
       double gjeresia = box.gjeresia;
       double lartesia = box.lartesia;

       System.out.println("Gjatesia : " +box.gjatesia);
        System.out.println("Gjeresia : " +box.gjeresia);
        System.out.println("Lartesia: " +box.lartesia);

        double vellimi =  box.vellimi ();
        System.out.println("Vellimi i 1 : " +vellimi);

      // double Vellimibox = box.gjatesia*box.gjeresia*box.lartesia;
       // System.out.println("Vellimi i box : " +Vellimibox);

        double gjatesiad = box2.gjatesia;
        double gjeresiad = box2.gjeresia;
        double lartesiad = box2.lartesia;

        System.out.println("Gjatesia : " +box2.gjatesia);
        System.out.println("Gjeresia : " +box2.gjeresia);
        System.out.println("Lartesia: " +box2.lartesia);

        double vellimi2 = box2.vellimi();
        System.out.println("Vellimi i 2  : " + vellimi2);

       // double Vellimibox2 = box2.gjatesia*box2.gjeresia*box2.lartesia;
      //  System.out.println("Vellimi i box2 : " + Vellimibox2);

    }
}