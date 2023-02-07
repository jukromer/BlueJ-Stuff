public class Knoten extends Listenelement
{   
    Listenelement nachfolger;
    int preis;
    Bestellung bestellung;
    public int umsatzBerechnen() {
      int gesamtpreis;
      gesamtpreis = nachfolger.umsatzBerechnen();
      gesamtpreis = gesamtpreis + bestellung.preisBerechnen();
      return gesamtpreis;
    }
    
    
}
