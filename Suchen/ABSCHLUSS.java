public class ABSCHLUSS extends LISTENELEMENT {
    public int laengeGeben() {
       return 0; 
    }
    
    public KNOTEN hintenEinfuegen(KUNDE kunde) {
        return new KNOTEN(kunde, this);
    }
    
    public LISTENELEMENT nachfolgerGeben() {
        return null;
    }
    
    public KUNDE suchen(String name) {
        return null;
    }
    
    public KUNDE kundeGeben() {
        return null;
    }
    
    public KNOTEN sortiertEinfuegen(KUNDE k) {
        return new KNOTEN(k, this);
    }
    
    public void ausgeben() {
        
    }
    
    public void suchenEntfernen(String name) {
        System.out.println("Kein Kunden mit dem Namen " + name + " gefunden.");
    }
}
