package CuoiKyModule2.Main;

import CuoiKyModule2.Controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }
}
