package course12.homework.challenge1;

class Address {

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