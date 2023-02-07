public class WARTEZIMMER 

{ 

    private PATIENT anfang;
    private PATIENT anfangAlt;
    
    
    public WARTEZIMMER() 
    { 

    }
    
    public void anfangEntfernen() {
        anfangAlt = anfang;
        anfang = anfang.nachfolgerGeben();  
    }
    
    public void patientEinfügen(PATIENT p) {
        if(anfang != null) {
            anfang.patientEinfügen(p);
        }
        else {
            anfangSetzen(p);
        }
    }
    
    public void wartendePatientenAusgeben() 

    { 
        if(anfang != null) {
            anfang.patientenDatenAusgeben();
        }
        
        
        
    } 
    
    public int AnzahlGeben() {
         int zahl = anfang.anzahlHierGeben(0);
         return zahl;
    }
    
    public int AnzahlGeben2() {
        int zahl = anfang.anzahlHierGeben2();
        return zahl;
    }
    
    public void bestimmtenPatientEntfernen(PATIENT p, String name) {
        
        
        if(anfang != null && anfang.getName() == name) {
            anfangEntfernen();
        }
        else if(anfang.nachfolgerGeben() == null) {
            System.out.println("\nKein Patient mit dem Namen " + name + " gefunden.");
        }
        else {
            if(anfang.nachfolgerGeben().getName() == name) {
                
            }
        }
    }
    
    public void anfangSetzen(PATIENT p) {
        
        anfang = p;
        
    }
    
    public void Behandelter() {
        if(anfangAlt != null) {
            System.out.println("\nDer Patient im Behandlungszimmer: ");
            System.out.println("\nName des Patienten: " + anfangAlt.getName() + "\nAlter des Patienten: " + anfangAlt.getAlter() + "\nGesundheitsstatus: " + anfangAlt.getGesund());
        }else {
            System.out.println("\nMomentan ist niemand im Behandlungszimmer.");
        }
    }
    
    

} 