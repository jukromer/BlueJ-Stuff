

public class KNOTEN extends LISTENELEMENT
{
    LISTENELEMENT nachfolger;
    DATENELEMENT kunde;
    
    
    public KNOTEN (DATENELEMENT k, LISTENELEMENT l) {
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
      
    public DATENELEMENT kundeGeben() {
        return kunde;
    }
    
    
    public DATENELEMENT suchen(String name) {
        if(kunde.nameGeben() == name) {
            return kunde;
        }
        else{
            return nachfolger.suchen(name);
        }
    }
    
    public KNOTEN sortiertEinfuegen(DATENELEMENT k) {
        if(kunde.nameGeben().compareTo(k.nameGeben()) < 0) {
            nachfolger = nachfolger.sortiertEinfuegen(k);
            return this;
        }else{
            KNOTEN knoten = new KNOTEN(k, this);
            return knoten;
        }
        
    }
    
    public void ausgeben() {
        kunde.InformationenAusgeben();
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
