package com.bibliotheque.validator;

import com.bibliotheque.validator.Error.NotValidData;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Validator {

    private static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    private static final String VALID_PASSWORD_REGEX = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

    private static final String VALID_NAME_REGEX = "^([a-zA-Z])+(.{2,})+$";

    //private final String VALID_PSEUDO_NAME_REGEX = "(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$)";

    public static Boolean isEmailValid(String email){
        return validate(email, VALID_EMAIL_ADDRESS_REGEX);

    }

    public static Boolean isPasswordValid(String password) throws NotValidData{
        return validate(password, VALID_PASSWORD_REGEX);

    }

    public static Boolean isNameValid(String name) throws NotValidData{
        return validate(name, VALID_NAME_REGEX);
    }

    private static boolean validate(String value, String regex) {
        final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }


}
