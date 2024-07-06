import java.util.ArrayList;
public class Main {                                         // TASK 19
    public static void main(String[] args) {

        Autor autor1 = new Autor( "Kadare " , "Shqiptar" );
        Autor autor2 = new Autor( "Fishta" , "Shqiptar");
        Autor autor3 = new Autor("Frasheri" , "Shqiptar");

        Poem poem1 = new Poem(autor1,4);
        Poem poem2 = new Poem(autor2,7);
        Poem poem3 = new Poem(autor3,10);

        ArrayList <Poem> poemat = new ArrayList<>();
        poemat.add(poem1);
        poemat.add(poem2);
        poemat.add(poem3);

        Poem poemLongest = poemat.get(0);
        for ( Poem poema : poemat ){
            if (poema.getStropheNumbers() > poemLongest.getStropheNumbers()){
                poemLongest = poema;
            }
        }
        System.out.println("Surname of an author that wrote the longest poem : " +poemLongest.getCreator().getSurname());
    }
}
