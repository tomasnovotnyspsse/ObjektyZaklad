package objektzaklad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Objektzaklad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelefonniSeznam polozka1 = new TelefonniSeznam();
        polozka1.jmeno = "Bonifác";
        polozka1.prijmeni = "Novák";
        polozka1.cislo = 123456789;

        BufferedWriter vystup;
        try {
            vystup = new BufferedWriter(new FileWriter("pokus.txt"));
            vystup.write(polozka1.toString());
            vystup.close();
        } catch (IOException ex) {
            Logger.getLogger(Objektzaklad.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //BufferWriter vystup2;
        //vystup2 = new BufferedWriter(new FileWriter("dvojka.txt"));
        vystup2.write(polozka1.)

    }

}
