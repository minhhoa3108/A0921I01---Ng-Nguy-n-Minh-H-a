package controllers;

import services.ICustomerService;
import services.impl.CustomerServiceImpl;

import java.util.Scanner;

public class ControllerFurama {
    private  ICustomerService customerService = new CustomerServiceImpl();
    public  void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag= true;
        do {
            System.out.println("Chọn chức năng\n"+
                    "1. add\n"+
                    "2. display\n"+
                    "3. delete\n"+
                    "4. edit\"" +
                    "5. search\n"+
                    "6.exit");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    System.out.println("thêm mới");
                    customerService.add();
                    // add
                    break;
                case 2:
                    System.out.println("hiện thi danh sach");
                    customerService.display();
                    // display
                    break;
                case 3:
                    System.out.println("Xóa");
                    customerService.delete();
                    // delete
                    break;
                case 4:
                    System.out.println("edit");
                    // edit
                    break;
                case 5:
                    System.out.println("search");
                    //search
                    customerService.searchByName();
                    break;
                default:
                    flag =false;
            }
        }while (flag);


    }
}
