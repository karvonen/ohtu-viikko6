package komennot;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public class Nollaa extends Komento {

    private int edellinen;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
        edellinen = 0;
    }

    @Override
    public void suorita() {
        edellinen = getTulos();
        sovellus.nollaa();
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
