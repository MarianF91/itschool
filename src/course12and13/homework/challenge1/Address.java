package course12and13.homework.challenge1;

public class Address {

    String city;
    String county;
    String street;
    String houseNumber;
    String country;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}