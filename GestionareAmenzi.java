import java.util.*;

public class GestionareAmenzi {
    private List<Amenda> amenzi;

    public GestionareAmenzi() {
        this.amenzi = new ArrayList<>();
    }
    public void adaugaAmenda(Amenda amenda) {
        amenzi.add(amenda);
    }
}
public List<Amenda> getAmenzi() {
    return amenzi;
    for (Amenda amenda : amenzi) {
        System.out.println(amenda);
    }
    public double getTotalPersoane(String cnp) {
        List<Amenda> amenzile =getAmenzilePersoane(cnp);
        double total=0;
        for (Amenda amenda : amenzile) {
            total += amenda.calculAmenzi();
        }
        return total;
    }
}

