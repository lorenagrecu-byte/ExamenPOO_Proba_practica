public class AmendaParc extends amenzi_politie {
    private static final double VALOARE_AMENDA = 30.0;
private double valoareBun;

public AmendaParc(String cnp, double valoareBun) {
    super(cnp);
    this.valoareBun = valoareBun;
}
@Override
    public double calculAmenzi(){
        return VALOARE_AMENDA + (0.1 * valoareBun);
    }

public double getValoareBun() {
    return valoareBun;
}