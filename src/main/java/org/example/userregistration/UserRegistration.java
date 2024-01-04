package org.example.userregistration;

import org.example.userregistration.InvalidUserDetailsException;

import java.util.function.Predicate;

public class UserRegistration {
    public boolean validateInput(String input, Predicate<String> validator) throws InvalidUserDetailsException {
        if (!validator.test(input)) {
            throw new InvalidUserDetailsException("Invalid input");
        }
        return true;
    }

    public boolean validateFirstName(String firstName) throws InvalidUserDetailsException {
        Predicate<String> firstNameValidator = firstNameStr -> firstNameStr.matches("[A-Z][a-zA-Z]{2,}");
        return validateInput(firstName, firstNameValidator);
    }

    public boolean validateLastName(String lastName) throws InvalidUserDetailsException {
        Predicate<String> lastNameValidator = lastNameStr -> lastNameStr.matches("[A-Z][a-zA-Z]{2,}");
        return validateInput(lastName, lastNameValidator);
    }

    public boolean validateEmail(String email) throws InvalidUserDetailsException {
        Predicate<String> emailValidator = emailStr -> emailStr.matches("^[A-Za-z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,4})(\\.[a-zA-Z]{2,4})*$");
        return validateInput(email, emailValidator);
    }

    public boolean validateMobile(String mobile) throws InvalidUserDetailsException {
        Predicate<String> mobileValidator = mobileStr -> mobileStr.matches("\\d{2}\\s\\d{10}");
        return validateInput(mobile, mobileValidator);
    }

    public boolean validatePassword(String password) throws InvalidUserDetailsException {
        Predicate<String> passwordValidator = passwordStr -> passwordStr.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        return validateInput(password, passwordValidator);
    }
}
