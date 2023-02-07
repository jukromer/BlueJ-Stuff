
public class LISTE
{
    KNOTEN anfang;
    KNOTEN anfangAlt;
    
    public void anfangSetzen(KNOTEN k) {
        anfang = k;
    }
    
    public int laengeGeben() {
        int zahl = anfang.laengeGeben();
        return zahl;
    }
    
    public void hintenEinfuegen(KUNDE kunde) {
        if(anfang != null) {
            anfang.hintenEinfuegen(kunde);
        }
        else {
            KNOTEN k = new KNOTEN();
            k.kundeSetzen(kunde);
            anfangSetzen(k);
        }
    }
    
    public KNOTEN erstesElementEnfernen() {
        anfangAlt = anfang;
        anfang = anfang.nachfolgerGeben();  
        return anfangAlt;
    }
}
