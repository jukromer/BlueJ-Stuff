
public class Test{

    WARTEZIMMER wartezimmer = new WARTEZIMMER();
    PATIENT patient1 = new PATIENT("Walter White", 51, false);
    PATIENT patient2 = new PATIENT("Skyler White", 45, true);
    PATIENT patient3 = new PATIENT("Walter Jr White",16, false);
    
    PATIENT patient;
    
    public Test() {
        wartezimmer.patientEinfügen(patient1);
        wartezimmer.patientEinfügen(patient2);
        wartezimmer.patientEinfügen(patient3);
        
    }
    
    
    public void patientLöschen(){
        wartezimmer.anfangEntfernen();  
    }
    
    
    public void Behandelter() {
        wartezimmer.Behandelter();
    }
    
    public void DatenAusgeben() {
        wartezimmer.wartendePatientenAusgeben();
    }
    
    public void AnzahlAusgeben() {
        System.out.println(wartezimmer.AnzahlGeben()); 
    }
    
    public void AnzahlAusgeben2() {
        System.out.println(wartezimmer.AnzahlGeben2());
    }
   
    


}


