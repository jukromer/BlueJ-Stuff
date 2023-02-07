

public class KNOTEN
{
    KNOTEN nachfolger;
    KUNDE kunde;
        
    public void nachfolgerSetzen(KNOTEN k) {
        nachfolger = k;
    }
    
    public KNOTEN nachfolgerGeben() {
        return nachfolger;
    }
    
    public int laengeGeben() {
        int zahl = 1;
        if(nachfolger != null) {
            
             zahl = nachfolger.laengeGeben();
             zahl++;    
        }
        return zahl;
    }
    
    public void kundeSetzen(KUNDE k) {
        kunde = k;
    }
      
    public void hintenEinfuegen(KUNDE kunde) {
        if(nachfolger != null) {
            
            
            nachfolger.hintenEinfuegen(kunde);
            }
        else {
            KNOTEN k = new KNOTEN();
            k.kundeSetzen(kunde);
            nachfolgerSetzen(k);
        }
    }
      
    public KUNDE kundeGeben() {
        return kunde;
    }
}
