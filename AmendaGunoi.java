public class AmendaGunoi extends amenzi_politie {
    private static final double VALOARE_AMENDA = 200.0;
}

public AmendaGunoi(String cnp) {
    super(cnp);

    if (factorZonal<1 || factorZonal>4) {
        throw new IllegalArgumentException("Factorul zonal trebuie sa fie intre 1 si 4.");
    }
    this.factorZonal = factorZonal;
}

public double getFactorZonal() {
    return factorZonal;
}