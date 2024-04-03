package com.example.review1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
     @Id
     private int eid;
     public int getEid() {
      return eid;
    }
    public void setEid(int eid) {
      this.eid = eid;
    }
    private String name;
     private String email;
     private String hotel;
     private String foodcategory;
     private String foodname;
     private long phno;
     private String address;
     private int pincode;
     private int price;
    public Food() {
    }
    public Food(int eid, String name, String email, String hotel, String foodcategory, String foodname, long phno,
        String address, int pincode, int price) {
      this.eid = eid;
      this.name = name;
      this.email = email;
      this.hotel = hotel;
      this.foodcategory = foodcategory;
      this.foodname = foodname;
      this.phno = phno;
      this.address = address;
      this.pincode = pincode;
      this.price = price;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getEmail() {
      return email;
    }
    public void setEmail(String email) {
      this.email = email;
    }
    public String getHotel() {
      return hotel;
    }
    public void setHotel(String hotel) {
      this.hotel = hotel;
    }
    public String getFoodcategory() {
      return foodcategory;
    }
    public void setFoodcategory(String foodcategory) {
      this.foodcategory = foodcategory;
    }
    public String getFoodname() {
      return foodname;
    }
    public void setFoodname(String foodname) {
      this.foodname = foodname;
    }
    public long getPhno() {
      return phno;
    }
    public void setPhno(long phno) {
      this.phno = phno;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public int getPincode() {
      return pincode;
    }
    public void setPincode(int pincode) {
      this.pincode = pincode;
    }
    public int getPrice() {
      return price;
    }
    public void setPrice(int price) {
      this.price = price;
    }
    
  }