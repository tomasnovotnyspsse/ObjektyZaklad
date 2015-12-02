
package objektzaklad;

/**  třída pro definici položky v telefonnim seznamu
 *
 * @author Tom
 */
public class TelefonniSeznam {
    String jmeno;
    String prijmeni;
    long cislo;
    
    public String toString()
    {
       String vystup;
       vystup = "Jmeno: " + this.jmeno + "\r\n";
       vystup += "Prijmeni: " + this.prijmeni + "\r\n";
       vystup += "Tel. cislo: " + this.cislo + "\r\n";
        return (vystup);
    }
}
