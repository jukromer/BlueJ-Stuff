public abstract class LISTENELEMENT {
    public abstract KNOTEN hintenEinfuegen(KUNDE kunde);
    public abstract int laengeGeben();
    public abstract LISTENELEMENT nachfolgerGeben();
    public abstract DATENELEMENT suchen(String name);
    public abstract DATENELEMENT kundeGeben();
    public abstract KNOTEN sortiertEinfuegen(DATENELEMENT k);
    public abstract void ausgeben();
    public abstract void suchenEntfernen(String name);
}