package PackagePizzarias;

public class Klant {
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String phoneNumber;

    public Klant(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Klant(String name, String streetAddress, String city, String state, String zipCode, String email, String phoneNumber) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Todo method for ordering pizza
    // public Boolean placeOrder(Pizza pizza){}
}
