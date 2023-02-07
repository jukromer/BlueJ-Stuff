public class Knoten extends Baumelement {
    Datenelement data;
    Baumelement nachfolgerL;
    Baumelement nachfolgerR;
    
    
    public Knoten( Datenelement data) {
        nachfolgerL = new Abschluss();
        nachfolgerR = new Abschluss();
        this.data = data;
    }
    
    public Baumelement Einfuegen(Kunde k) {
        if(data.getID() < k.getID()) {
            nachfolgerR = nachfolgerR.Einfuegen(k);
        }
        else if(data.getID() > k.getID()){
            nachfolgerL = nachfolgerL.Einfuegen(k);
        }
        else {
            System.out.println("Fehler: Diese ID gibt es schon!!!");
        }
        return this;
    }
    
    
    
    public Datenelement getData() {
        return data;
    }
    
    public void ausgeben() {
        System.out.println(data.getID());
        nachfolgerL.ausgeben();
        nachfolgerR.ausgeben();
        
    }
    
    public Baumelement entfernen(int e) {
        if(e == data.getID()) {
            return nachfolgerL.Einfuegen(nachfolgerR);
        }
        else if(e > data.getID()) {
            nachfolgerR = nachfolgerR.entfernen(e);
            return this;
        }
        else {
            nachfolgerL = nachfolgerL.entfernen(e);
            return this;
        }
        
        
    
    }
}