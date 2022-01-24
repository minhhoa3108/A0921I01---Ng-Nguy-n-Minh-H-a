package session19.bai_tap.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_CLASS_REGEX = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public ValidateNameClass(){}

    public boolean validateNameClass(String regex){
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
