public class AmendaParcare extends amenzi_politie {
    private static final double VALOARE_AMENDA =500.0;

    public AmendaParcare(String cnp) {
        super(cnp);
    }
    
    @Override
    public double calculAmenzi() {
        return VALOARE_AMENDA;
    }
    @Override
    public String toString() {
        return "AmendaParcare{" +
                "cnp='" + cnp + '\'' +
                ", valoareAmenda=" + VALOARE_AMENDA +
                '}';
    }
    public String getTipAmenzi() {
        return "Amenda pentru parcare neregulamentara";
    }
}