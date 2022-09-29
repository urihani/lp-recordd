package essais;

import common.SaisieMorceau;
import model.Morceau;

public class LocalTimeTest {
    public static void main(String[] args) {
        Morceau morceau = SaisieMorceau.SaisirMorceau();
        
        System.out.println(morceau);
    }
}
