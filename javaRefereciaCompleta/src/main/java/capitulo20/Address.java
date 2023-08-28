package capitulo20;
//TODO capitulo 20 java.util Part 1: The Collections Framework Exploring java.lang Demonstracao 10

// Um exemplo simples de lista de discussão.
public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;


    public Address(String n, String s, String c, String st, String cd) {
        this.name = n;
        this.street = s;
        this.city = c;
        this.state = st;
        this.code = cd;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city +
                " " + state + " " + code;
    }


}
