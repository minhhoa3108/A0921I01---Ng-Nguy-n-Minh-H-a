package session19.bai_tap.ValidatePhone;

public class Main {
    private static ValidatePhone validatePhone;

    private static final String[] validPhone = new String[]{"84-0978489648", "12-0512978512"};
    private static final String[] invalidPhone = new String[]{"a1-9999999", "aa-051297as512"};

    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
        for (String phone : validPhone){
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isvalid);
        }
        System.out.println("-------------");
        for (String phone : invalidPhone){
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone + " is valid: " + isvalid);
        }
    }
}
