package PackagePizzarias;

public class Bodem {
    private Enum<TypeBodem> bodemType;
    private Enum<Formaatbodem> bodemFormaat;

    public Bodem(Enum<TypeBodem> bodemType, Enum<Formaatbodem> bodemFormaat) {
        this.bodemType = bodemType;
        this.bodemFormaat = bodemFormaat;
    }

    public Enum<TypeBodem> getBodemType() {
        return bodemType;
    }

    public Enum<Formaatbodem> getBodemFormaat() {
        return bodemFormaat;
    }
}
