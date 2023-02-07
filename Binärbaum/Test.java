public class Test {
    Baum baum = new Baum();
    Kunde kunde1 = new Kunde(10);
    Kunde kunde2 = new Kunde(5);
    Kunde kunde3 = new Kunde(15);
    Kunde kunde4 = new Kunde(8);
    Kunde kunde5 = new Kunde(3);
    Kunde kunde6 = new Kunde(13);
    Kunde kunde7 = new Kunde(18);
    
    public Test(){
        baum.Einfuegen(kunde1);
        baum.Einfuegen(kunde2);
        baum.Einfuegen(kunde3);
        baum.Einfuegen(kunde4);
        baum.Einfuegen(kunde5);
        baum.Einfuegen(kunde6);
        baum.Einfuegen(kunde7);
    }
    
    public void ausgeben() {
        baum.ausgeben();
    }
}