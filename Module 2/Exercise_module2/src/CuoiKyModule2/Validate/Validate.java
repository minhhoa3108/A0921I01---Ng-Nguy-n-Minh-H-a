package CuoiKyModule2.Validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String TEN_REGEX = "^[a-z A-Z]{4,50}$";
    private static final String NGAY_SINH_REGEX = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)$";
    private  static final String PHONE_REGEX = "^(090|091)+([0-9]{7})$";
    private static final String CLASS_REGEX = "^[C][0-9]{4}[G][1]$";


    public Validate(){}

    public boolean validateTen(String regex){
        Pattern pattern = Pattern.compile(TEN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateNgaySinh(String regex){
        Pattern pattern = Pattern.compile(NGAY_SINH_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateSdt(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateMaLopHoc(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
