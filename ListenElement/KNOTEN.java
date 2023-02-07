

public class KNOTEN extends LISTENELEMENT
{
    LISTENELEMENT nachfolger;
    KUNDE kunde;
    
    
    public KNOTEN (KUNDE k, LISTENELEMENT l) {
        kunde = k;
        nachfolger = l;
    }
    
    public void nachfolgerSetzen(LISTENELEMENT l) {
        nachfolger = l;
    }
    
    public LISTENELEMENT nachfolgerGeben() {
        return nachfolger;
    }
    
    public int laengeGeben() {
        int zahl = nachfolger.laengeGeben();
        return zahl=zahl+1;
    }
    
    public void kundeSetzen(KUNDE k) {
        kunde = k;
    }
      
    public KNOTEN hintenEinfuegen(KUNDE kunde) {
        nachfolger = nachfolger.hintenEinfuegen(kunde);
        return this;
    }
      
    public KUNDE kundeGeben() {
        return kunde;
    }
    
    
}
