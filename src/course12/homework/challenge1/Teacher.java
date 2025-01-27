package course12.homework.challenge1;

public class Teacher {

    PersonalInfo teacherInfo = new PersonalInfo();

    ContactInfo contactInfo = new ContactInfo();
    Address address = new Address();

    @Override
    public String toString() {
        return "Teacher: " + teacherInfo.firstName + " " + teacherInfo.lastName + "\nSex: " + teacherInfo.sex +
                "\nAge: " + teacherInfo.age + "\nBirthday: " + teacherInfo.birthday + "\nSSN: " + teacherInfo.ssn +
                "\nCountry: " + address.country + "\nCounty" + address.county + "\nCity: " + address.city +
                "\nStreet: " + address.street + "\nHouse Number: " + address.houseNumber +"\nEmail: " + contactInfo.email +
                "\nPhone number: " + contactInfo.phoneNumber + "\n";
    }
}