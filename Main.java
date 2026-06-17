import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestionareAmenzi gestionareAmenzi = new GestionareAmenzi();

        Amenda amenda1 = new Amenda("1234567890123", 100.0);
        Amenda amenda2 = new Amenda("1234567890123", 200.0);
        Amenda amenda3 = new Amenda("9876543210987", 150.0);

        gestionareAmenzi.adaugaAmenda(amenda1);
        gestionareAmenzi.adaugaAmenda(amenda2);
        gestionareAmenzi.adaugaAmenda(amenda3);

        String cnp = "1234567890123";
        double totalPersoane = gestionareAmenzi.getTotalPersoane(cnp);
        System.out.println("Total amenzi pentru persoana cu CNP " + cnp + ": " + totalPersoane);
    }
}

/Avantajele folosiri polimorfismului in acest caz sunt urmatoarele:
1.In primul rand : Polimorfismul permite tratarea obiectelor de tipuri diferite printr-o interfață comună, ceea ce face codul mai flexibil și mai ușor de extins. De exemplu, putem adăuga noi tipuri de amenzi fără a modifica codul existent.
2.In al doilea rand, refolosirea codului: Polimorfismul permite reutilizarea codului prin definirea unor metode comune în clasele de bază și suprascrierea acestora în clasele derivate. Astfel, putem avea o metodă generală pentru calcularea amenzilor, care poate fi implementată diferit în funcție de tipul de amendă.