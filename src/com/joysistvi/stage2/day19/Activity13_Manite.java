package com.joysistvi.stage2.day19;

public class Activity13_Manite {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public Activity13_Manite(String firstName, String middleName, String lastName, String address, String email, String password) {

       while (true) {
           if ((firstName != null || middleName != null || lastName != null || address != null || email != null || password != null)) {
               this.firstName = firstName;
               this.middleName = middleName;
               this.lastName = lastName;
               this.address = address;
               this.email = email;
               this.password = password;
               break;
           } else {
               System.out.println("Invalid input");
           }
       }

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
