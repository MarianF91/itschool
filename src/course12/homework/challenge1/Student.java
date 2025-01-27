package course12.homework.challenge1;

public class Student {

    PersonalInfo studentPersonalInfo = new PersonalInfo();
    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();

    @Override
    public String toString() {
        return "Student: " + studentPersonalInfo.firstName + " " + studentPersonalInfo.lastName +
                "\nSex: " + studentPersonalInfo.sex +"\nAge: " + studentPersonalInfo.age + "\nBirthday: " +
                studentPersonalInfo.birthday + "\nSSN: " + studentPersonalInfo.ssn + "\nAge: " + studentPersonalInfo.age +
                "\nCountry: " + address.country + "\nCounty" + address.county + ", City: " + address.city +
                "\nStreet: " + address.street + "\nHouse Number: " + address.houseNumber +"\nEmail: " + contactInfo.email +
                "\nPhone number: " + contactInfo.phoneNumber + "\n";
    }
}