package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;
public class Product{

    private UUID productId;
    private String name;
    private int price;
    private int quantity;
    private int product_number;
    private ArrayList<Comments> productComments;
    private SubCategory subCategory=null;

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }



    public void addProductComment(Comments comments){
        productComments.add(comments);
    }

    public ArrayList<Comments> getProductComments() {
        return productComments;
    }

    public Product(String name, int price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.productId=UUID.randomUUID();


    }

    public void setProduct_number(int product_number) {
        this.product_number = product_number;
    }

    public int getProduct_number() {
        return product_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public UUID getProductId() {
        return productId;
    }

}

