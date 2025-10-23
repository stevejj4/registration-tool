package org.example;

public class registration {
    private String firstName;
    private String secondName;
    private String dateOfBirth;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String altPhoneNumber;

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName= secondName;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAltPhoneNumber(String altPhoneNumber) {
        this.altPhoneNumber = altPhoneNumber;
    }
    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public String getGender() {
        return gender;
    }
    public String getAltPhoneNumber() {
        return altPhoneNumber;
    }

    public void displayInfo() {
        System.out.println("Registration successful, confirm your details");
        System.out.println("First name " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Date of birth (MM-DD-YYYY: " + dateOfBirth);
        System.out.println("Gender:" + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Alternative phone number: " + altPhoneNumber);
    }
}
