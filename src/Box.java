public class Box {

    public double gjatesia;
    public double gjeresia;
    public double lartesia;


    public Box ( double gjatesia , double gjeresia , double lartesia ) {
        this.gjatesia=gjatesia;
        this.gjeresia=gjeresia;
        this.lartesia=lartesia;
    }

    public double vellimi () { double vellimi = this.lartesia*this.gjatesia*this.gjeresia;
        return vellimi ;
    }
}

