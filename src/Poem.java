public class Poem {          // TASK 19

    private Autor creator ;
    private int stropheNumbers;

    public Poem ( Autor creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Autor getCreator() {
        return creator;
    }

    public void setCreator(Autor creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
