package perseritje;

public class Human {

   public  String emri ;
    public String id;
    public int mosha = 20;

    public Human () {}
    public Human (String emri ) {
        this.emri=emri;
    }

    public Human ( String id , String emri , int mosha) {
        this.id=id;
        this.emri=emri;
        this.mosha=mosha;
    }

    public void walk () {
        System.out.println(emri + " eshte duke ecur!");
    }

    public void sleep () {
        System.out.println(emri + " eshte duke fjetur!");
    }

}
