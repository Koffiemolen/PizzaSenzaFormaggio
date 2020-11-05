package PackagePizzarias;

public class Kaas {
    private Enum<Kaassoort> kaassoort;

    public Kaas(Enum<Kaassoort> kaassoort) {
        this.kaassoort = kaassoort;
    }

    public Enum<Kaassoort> getKaassoort() {
        return kaassoort;
    }
}
