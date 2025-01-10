package forme;

public class Triangolo extends Forma {
    private double altezza;
    private double base;

    public Triangolo (double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public double getBase (){
        return this.base;
    }
    public double getAltezza(){
        return this.altezza;
    }

}
