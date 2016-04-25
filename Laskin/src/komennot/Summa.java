package komennot;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public class Summa extends Komento {

    int edellinen;
    
    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        super(sovellus, tuloskentta, syotekentta);
        edellinen = 0;
    }

    @Override
    public void suorita() {
        edellinen = getTulos();
        int arvo = getSyote();
        sovellus.plus(arvo);
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
