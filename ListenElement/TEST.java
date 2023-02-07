
public class TEST
{
    LISTE liste = new LISTE();
    KUNDE kunde1 = new KUNDE("Walter White", 51);
    KUNDE kunde2 = new KUNDE("Skyler White", 42);
    KUNDE kunde3 = new KUNDE("Walter Jr White", 16);
    KUNDE kunde4 = new KUNDE("Jesse Pinkman", 23);
    KUNDE kunde5 = new KUNDE("Tuco", 45);
    public TEST() {
        
        liste.hintenEinfuegen(kunde1);
        liste.hintenEinfuegen(kunde2);
        liste.hintenEinfuegen(kunde3);
        liste.hintenEinfuegen(kunde4);
        liste.hintenEinfuegen(kunde5);
    }
    
    public void laengeGeben() {
        int laenge = liste.laengeGeben();
        System.out.println(laenge);
    }
    
    public void entfernen() {
        liste.erstesElementEnfernen();
    }
    
    
    
    
    
}



