package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Application!");
        CategoryService categoryService=new CategoryService();
        categoryService.initialize();
        categoryService.printAllCategories();
        //ProductService productService=new ProductService();
        //Seller seller1=new Seller("1234","nazi","lll","09","ki");
        //productService.addProduct(seller1);
        //OptionMenu optionMenu=new OptionMenu();
        //optionMenu.WelcomeMenu();
        // UserService userServic=new UserService();
        // userServic.adminSignUp();
        // System.out.println("sign up finished...");
        // userServic.adminLogin();
        // System.out.println("login finished...");
        // userServic.adminEdit();
        //var categoryService = new CategoryService();

        //categoryService.printAll();


    }
}