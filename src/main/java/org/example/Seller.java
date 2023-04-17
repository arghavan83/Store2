package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Seller extends User {
    private UUID sellerId;
    private String companyName;
    private ArrayList<Product> sellersProducts=new ArrayList<>();


    private boolean isConfirmed = false;
    public Seller(String password,String userName, String emailAddress, String phoneNumber,String companyName){
        super(userName, password, emailAddress, phoneNumber);
        this.companyName= companyName;
        this.sellerId=UUID.randomUUID();

    }

    public ArrayList<Product> getSellersProducts() {
        return sellersProducts;
    }

    public void printSellersProducts() {
        for(Product product:sellersProducts){
            System.out.print(product.getName()+"  "+product.getPrice()+" "+product.getQuantity());


    }}
    public void addproduct(Product product){
        sellersProducts.add(product);
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    public UUID getSellerId() {
        return sellerId;
    }
}
