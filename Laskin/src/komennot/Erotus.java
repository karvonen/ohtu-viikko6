package komennot;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public class Erotus extends Komento {
    
    private int edellinen;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
        edellinen = 0;
    }

    @Override
    public void suorita() {
        int arvo = getSyote();
        edellinen = getTulos();
        this.sovellus.miinus(arvo);
        int laskunTulos = sovellus.tulos();

        setTulos(laskunTulos);
    }

    @Override
    public void peru() {
        this.sovellus.nollaa();
        this.sovellus.plus(edellinen);
        setTulos(edellinen);
    }

}
