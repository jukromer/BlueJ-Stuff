
public class Baum {
    Baumelement wurzel;
    
    public Baum() {
        wurzel = new Abschluss();
    }
    
    public void Einfuegen(Kunde k) {
        wurzel = wurzel.Einfuegen(k);
    }
    
    public void ausgeben() {
        wurzel.ausgeben();
    }
    
    
    public void entfernen(int e) {
        wurzel.entfernen(e);
    }
}