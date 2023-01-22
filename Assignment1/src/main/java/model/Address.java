/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tanujkodali
 */
public class Address {
    
    String street;
    String AptNo;
    String city;
    long zipcode;
    
    
    public Address(){
        this.street = "";
        this.AptNo="";
        this.city="";
        
            }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptNo() {
        return AptNo;
    }

    public void setAptNo(String AptNo) {
        this.AptNo = AptNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

   
   
    
}
 
    
