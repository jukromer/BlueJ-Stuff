
public class LISTE
{
    LISTENELEMENT anfang;
    LISTENELEMENT anfangAlt;
    
    public LISTE (){
        anfang = new ABSCHLUSS();
    }
    
    public void anfangSetzen(KNOTEN k) {
        anfang = k;
    }
    
    public int laengeGeben() {
        int zahl = anfang.laengeGeben();
        return zahl;
    }
    
    public void hintenEinfuegen(KUNDE kunde) {
       
        anfang = anfang.hintenEinfuegen(kunde);
        
    }
    
    public LISTENELEMENT erstesElementEnfernen() {
        anfangAlt = anfang;
        anfang = anfang.nachfolgerGeben();  
        return anfangAlt;
    }
    
    public DATENELEMENT suchen(String name) {
        return anfang.suchen(name);
    }
    
    public void sortiertEinfuegen(DATENELEMENT k) {
        anfang = anfang.sortiertEinfuegen(k);
    }
        
    public void ausgeben() {
        System.out.println(""); 
        anfang.ausgeben();
    }
    
    public void suchenEntfernen(String name) {
       if(anfang.kundeGeben() != null && anfang.kundeGeben().nameGeben() == name) {
            anfang = anfang.nachfolgerGeben();
        }
        else {
            anfang.suchenEntfernen(name);
        }
    }
}
