package com.email;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public boolean isValid (String emailAddress) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailAddress);
        return matcher.find();
    }

}

//package com.email;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class EmailValidator {
//        public boolean isValid (String emailAddress) {
//            Pattern pattern = Pattern.compile("@");
//            Matcher matcher = pattern.matcher(emailAddress);
//            return matcher.find();
//        }
//    }


