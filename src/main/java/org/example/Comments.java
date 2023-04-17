package org.example;

import java.util.UUID;

public class Comments {
    private UUID commentId;
    private User user;
    private String productName;
    private String comment;
    public Comments(User user,String productName,String comment){
        this.user=user;
        this.productName=productName;
        this.comment=comment;
        this.commentId=UUID.randomUUID();
    }

    public String getProductName() {
        return productName;
    }

    public String getComment() {
        return comment;
    }

    public UUID commentId() {
        return commentId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }
}
