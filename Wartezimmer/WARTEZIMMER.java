public class WARTEZIMMER 

{ 

    private int plaetze; 

    private int anzahlWartende; 

    private PATIENT[] patienten; 

 

    public WARTEZIMMER(int plaetzeNeu) 

    { 

        plaetze = plaetzeNeu; 

        anzahlWartende = 0; 

        patienten = new PATIENT[plaetze]; 

    } 

 

    public void neuerPatient(String vorname, String nachname, int alter, boolean gesund) 

    { 

        if(anzahlWartende < plaetze) 

        { 

            patienten[anzahlWartende] = new PATIENT(vorname, nachname, alter, gesund); 

            anzahlWartende++; 

        } 

    } 

 

    public void testpatientenHinzufuegen() 

    { 

        neuerPatient("Meier", "Anna", 20, false); 

        neuerPatient("Mueller", "Robert", 30, true); 

        neuerPatient("Huber", "Julia", 25, false); 

    } 

 

    public void wartendePatientenAusgeben() 

    { 

        for(int i = 0; i< plaetze; i++) 

        { 
            if(patienten[i] != null){
                patienten[i].patientendatenAusgeben(); 
            }
        } 

    } 

} 