package com.example.firebase_authentication;

public class UserModel {
    private String name, number,email;

    public UserModel(){

    }

    public UserModel(String name, String number, String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName(){
       return name;
     }
     public void setName(String name){
        this.name = name;
     }

    public String getNumber(){
        return name;
    }
    public void setNumber(String number){
        this.name = number;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.name = email;
    }



}
