public class PATIENT 

{ 

    private String nachname; 

    private String vorname; 

    private int alter; 

    private boolean gesund; 

 

    public PATIENT(String nachnameNeu, String vornameNeu, int alterNeu, boolean gesundNeu) 

    { 

        nachname = nachnameNeu; 

        vorname = vornameNeu; 

        alter = alterNeu; 

        gesund = gesundNeu; 

    } 

 

    public void patientendatenAusgeben() 

    { 

        System.out.println(nachname+", "+vorname+", "+alter+", gesund: "+gesund); 

    } 

} 