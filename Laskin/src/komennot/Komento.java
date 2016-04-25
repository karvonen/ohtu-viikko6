package komennot;

import javax.swing.JTextField;
import ohtu.Sovelluslogiikka;

public abstract class Komento {

    Sovelluslogiikka sovellus;
    JTextField tuloskentta;
    JTextField syotekentta;

    public Komento(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    public abstract void suorita();

    public abstract void peru();

    public void setTulos(int arvo) {
        syotekentta.setText("");
        tuloskentta.setText("" + arvo);
    }

    public int getSyote() {
        int arvo = 0;

        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        return arvo;
    }
    
    public int getTulos() {
        return Integer.parseInt(tuloskentta.getText());
    }
}
