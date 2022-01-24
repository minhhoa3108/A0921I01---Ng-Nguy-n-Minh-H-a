package session19.thuc_hanh.Email;

public class Main {
    private static EmailValidate emailValidate;
    public static final String[] validateemail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidateemail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailValidate = new EmailValidate();
        for (String email : validateemail){
            boolean isValid = emailValidate.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }

        for (String email : invalidateemail){
            boolean isValid = emailValidate.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}
