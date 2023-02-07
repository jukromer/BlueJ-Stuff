import java.util.Arrays;   
import java.util.stream.IntStream; 
public class WARTESCHLANGE
{
    int anzahlKunden;
    KUNDE[] kunden;
    
    
    public WARTESCHLANGE()
    {
        kunden = new KUNDE[10];
        
       
    }
    
    public void kundeEinfügen(KUNDE k) {
        kunden[anzahlKunden] = k;
        anzahlKunden++;
    }
    
    public void kundeEntfernen(){
        for(int i = 1; i < kunden.length; i++){
            kunden[i-1] = kunden[i];
        }
        
        anzahlKunden--; 
    }
    
    
    public void alleAusgeben(){
        for(int i = 0; i < kunden.length; i++) {
            if(kunden[i] != null) {
                System.out.println(kunden[i].name);
            }
        }
        
        
    }
    
    
}
