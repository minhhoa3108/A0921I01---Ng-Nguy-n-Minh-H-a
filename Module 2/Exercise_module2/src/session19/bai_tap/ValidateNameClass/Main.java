package session19.bai_tap.ValidateNameClass;

public class Main {
    private static ValidateNameClass validateNameClass;

    private static final String[] validClass = new String[] {"C0318G", "A0921H"};
    private static final String[] invalidClass = new String[]{"P0323A", "M0318G"};
    public static void main(String[] args) {
        validateNameClass = new ValidateNameClass();

        for (String nameClass : validClass){
            boolean isvalid = validateNameClass.validateNameClass(nameClass);
            System.out.println("Name Class is " + nameClass +" is valid: "+ isvalid);
        }
        System.out.println("---------------");
        for(String nameClass : invalidClass){
            boolean isvalid = validateNameClass.validateNameClass(nameClass);
            System.out.println("Name Class is " + nameClass +" is valid: "+ isvalid);
        }
    }
}
