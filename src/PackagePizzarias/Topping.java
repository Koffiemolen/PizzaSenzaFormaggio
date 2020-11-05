package PackagePizzarias;

public class Topping {
    private Enum<Toppingsoort> soort;
    private String naam;

    public Topping(Enum<Toppingsoort> soort, String naam) {
        this.soort = soort;
        this.naam = naam;
    }

    public Enum<Toppingsoort> getSoort() {
        return soort;
    }

    public String getNaam() {
        return naam;
    }
}
