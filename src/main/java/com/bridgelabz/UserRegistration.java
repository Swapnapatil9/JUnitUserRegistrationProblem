package com.bridgelabz;

public class UserRegistration {
    // Validate user first name
    public boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z]{1}[a-z]{2,}");
    }
    // Validate user last name
    public boolean validateLastName(String lastName) {
        return lastName.matches("[A-Z]{1}[a-z]{2,}");
    }
    // Validate user email
    public static boolean validateEmail(String email)
    {
        return email.matches("^[A-Za-z0-9+_.-]+@[a-zA-Z0-9._]+$");
    }

    // pre-defined mobile format
    public static boolean validateMobileFormat(String mobileNumber)
    {
        return mobileNumber.matches("[0-9]{2}\s[0-9]{10}");
    }

    //pre-defined password rules
    public static boolean validatePassword(String password)
    {
        return password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}$");
    }
}
