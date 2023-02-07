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
}
