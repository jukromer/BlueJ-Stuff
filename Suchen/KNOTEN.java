

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
    
    
    public KUNDE suchen(String name) {
        if(kunde.vergleichen(name)) {
            return kunde;
        }
        else{
            return nachfolger.suchen(name);
        }
    }
    
    public KNOTEN sortiertEinfuegen(KUNDE k) {
        if(kunde.nameGeben().compareTo(k.nameGeben()) < 0) {
            nachfolger = nachfolger.sortiertEinfuegen(k);
            return this;
        }else{
            KNOTEN knoten = new KNOTEN(k, this);
            return knoten;
        }
        
    }
    
    public void ausgeben() {
        System.out.println(kunde.nameGeben());
        nachfolger.ausgeben(); 
    }
    
    public void suchenEntfernen(String name) {
       if(nachfolger.kundeGeben() != null && nachfolger.kundeGeben().nameGeben() == name) {
            nachfolger = nachfolger.nachfolgerGeben();
        }
        else {
            nachfolger.suchenEntfernen(name);
        }
        
    }
    
}
