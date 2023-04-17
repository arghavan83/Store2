package org.example;

import java.util.Scanner;

public class CommentService extends ProductService{
    public void AddComment(User user){
        Scanner CommentInput=new Scanner(System.in);
        User newUser= user;
        System.out.println("please enter your productName");
        String newProductName=CommentInput.nextLine();
        System.out.println("please enter your comment");
        String newComment=CommentInput.nextLine();
        Comments comment=new Comments(newUser,newProductName,newComment);
        addProductComment2(comment);

    }

}
