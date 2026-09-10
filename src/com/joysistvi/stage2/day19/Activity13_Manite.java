package com.joysistvi.stage2.day19;

public class Activity13_Manite {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public Activity13_Manite(String firstName, String middleName, String lastName, String address, String email, String password) {
        String banner = "---------------------------\n" +
                        "| All fields are required |\n" +
                        "---------------------------";

       if ((firstName == null || firstName.isBlank() ||
           middleName == null || middleName.isBlank() ||
           lastName == null || lastName.isBlank() ||
           address == null || address.isBlank() ||
           email == null || email.isBlank() || !email.contains("@gmail.com") ||
           password == null || password.isBlank())) {

           throw new IllegalArgumentException("\n" + banner);
       }
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.address = address;
       this.email = email;
       this.password = password;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
