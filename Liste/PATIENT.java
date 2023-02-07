public class PATIENT implements DATENELEMENT {
    String name; 
    
    public PATIENT(String name) {
        this.name = name;
    }
    
    
    public void InformationenAusgeben() {
        System.out.println(name); 
    }
    
    
    public String nameGeben() {
        return name;
    }
}