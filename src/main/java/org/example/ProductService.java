package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductService  extends CategoryService{
    Scanner Input1=new Scanner(System.in);
    ArrayList<Product>productList=new ArrayList<Product>();
    int product_counter=1;

    public ProductService() {
        super();
    }

    public void addProduct(Seller seller){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your product name");
        String newProductName = input.nextLine();
        System.out.println("Enter your product price");
        int newPrice = input.nextInt();
        System.out.println("Enter your product quantity");
        int newQuantity = input.nextInt();
        input.nextLine();
        Product product = new Product(newProductName, newPrice, newQuantity);
        productList.add(product);
        product.setProduct_number(product_counter);
        product_counter++;
        setSubCategory2(product);
        seller.addproduct(product);
        System.out.println("product added successfully");


    }
    public void setSubCategory2(Product product) {
        System.out.println("please chose your product subcategory:");
        SubCategory subCategory=null;
        for (SubCategory subCategory1:super.subCategories){
            System.out.println(subCategory1.getName());
            System.out.println("is this your product subCategory?(yes/no)");
            String choice=Input1.nextLine();
            //Input1.nextLine();
            if(choice.equals("yes")){
                subCategory=subCategory1;
                product.setSubCategory(subCategory1);
                System.out.println("product subcategory set successfully");
                return;
            }
        }
        if(subCategory==null){
            System.out.println("you should chose one sub category");
            setSubCategory2(product);

        }
    }
    public  void addProductComment2(Comments comment){
        Product product1=null;
        for(Product product:productList){
            if(product.getName().equals(comment.getProductName())){
                product.addProductComment(comment);
                product1=product;
                System.out.println("comment saved successfully");
            }


        }
        if(product1==null){
            System.out.println("product not found please try again");
        }
        UserService userService=new UserService();
        userService.userMenu(comment.getUser());

    }
   // public void sellersProduct(Product product){
       // UserService userService=new UserService();
       // ArrayList<Seller> sellersList = userService.getsellersList();
        //for (Seller seller1:sellersList){
    //if(product.getSellerName().equals(seller1.getUserName())){

            }

