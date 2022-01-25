package session19.bai_tap.ValidatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_REGEX = "^(\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

    public ValidatePhone(){}

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(regex);
        return m.matches();
    }
}
