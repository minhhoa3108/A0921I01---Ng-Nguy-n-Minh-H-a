package common;

public class Validation {
    public static boolean checkName(String name){
        String regex ="^[a-zA-Z]{3,30}$";
        return name.matches(regex);

    }
    public static boolean checkPoint(String point){
        String regex ="^[\\d]{1,2}$";
        return point.matches(regex);

    }
    public static boolean checkEmail(String email){
        String regex ="^[a-zA-z]{6,}@gmail\\.com$";
        return email.matches(regex);

    }
}
