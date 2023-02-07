public class KUNDE implements DATENELEMENT
{
    String name;
    int alter;
    public KUNDE(String name2, int alter2) {
        name = name2;
        alter = alter2;
    }
    
    public int alterGeben() {
        return alter;
    }
    
    public String nameGeben() {
        return name;
    }
  
    public void InformationenAusgeben() {
        System.out.println(name);
    }
}
