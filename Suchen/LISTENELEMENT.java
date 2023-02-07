public abstract class LISTENELEMENT {
    public abstract KNOTEN hintenEinfuegen(KUNDE kunde);
    public abstract int laengeGeben();
    public abstract LISTENELEMENT nachfolgerGeben();
    public abstract KUNDE suchen(String name);
    public abstract KUNDE kundeGeben();
    public abstract KNOTEN sortiertEinfuegen(KUNDE k);
    public abstract void ausgeben();
    public abstract void suchenEntfernen(String name);
}