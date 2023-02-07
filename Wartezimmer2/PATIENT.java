public class PATIENT 

{ 
    
    public PATIENT nachfolger;
    
    private String name; 

    private int alter; 

    private boolean gesund; 
    
    public boolean starter = true;

 

    public PATIENT(String name2, int alter2, boolean gesund2) 

    { 

        name = name2;
        alter = alter2;
        gesund = gesund2;

    } 
    
    public void patientEinfügen(PATIENT p) {
        if(nachfolger != null) {
            nachfolger.patientEinfügen(p);
        }
        else {
            nachfolgerSetzen(p);
        }
    }
    
    
    public String getName() {
        return name;
    }
    
    public int getAlter() {
        return alter;
    }
    
    public boolean getGesund() {
        return gesund;
    }
    
    public void nachfolgerSetzen(PATIENT p) {
        
        nachfolger = p;
        
    }
    
    

     
    public PATIENT nachfolgerGeben() {
        return nachfolger;
    }

    public void patientenDatenAusgeben() {
        if(starter == true) {
            System.out.println("\nDie Patienten im Wartezimmer: ");
        }
        System.out.println("\nName des Patienten: " + name + "\nAlter des Patienten: " + alter + "\n Gesundheitsstatus: " + gesund);
        if(nachfolger != null) {
            nachfolger.starter = false; 
            nachfolger.patientenDatenAusgeben();
        }
        starter = true;
    }
    
    public int anzahlHierGeben(int zahl) {
        zahl++; 
        if(nachfolger != null) {
            
            zahl = nachfolger.anzahlHierGeben(zahl);
        }
        return zahl;
    }
    
    public int anzahlHierGeben2() {
        int zahl = 0;
        if(nachfolger != null) {
            
             zahl = nachfolger.anzahlHierGeben2();
             zahl++;
        }
        
        return zahl;
    
    }
    
    

} 