/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.contact;
import model.Address;

/**
 *
 * @author tanujkodali
 */
public class Person {
    long NUID;
    String Firstname;
    String Lastname;
    String Collegename;
    
    contact officephone;
    contact permanentphone;
    Address permanentaddress;
    Address officeaddress;
    
   
    //constructor for the code.................
    public Person(){
        
        this.Firstname = "";
        this.Lastname = "";
        this.Collegename ="";
    
        this.officephone= new contact();
        this.permanentphone= new contact();
        
        this.officeaddress= new Address();
        this.permanentaddress= new Address();
        
        
    }

    public contact getOfficephone() {
        return officephone;
    }

    public void setOfficephone(contact officephone) {
        this.officephone = officephone;
    }

    public contact getPermanentphone() {
        return permanentphone;
    }

    public void setPermanentphone(contact permanentphone) {
        this.permanentphone = permanentphone;
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getCollegename() {
        return Collegename;
    }

    public void setCollegename(String Collegename) {
        this.Collegename = Collegename;
    }

    public Address getPermanentaddress() {
        return permanentaddress;
    }

    public void setPermanentaddress(Address permanentaddress) {
        this.permanentaddress = permanentaddress;
    }

    public Address getOfficeaddress() {
        return officeaddress;
    }

    public void setOfficeaddress(Address officeaddress) {
        this.officeaddress = officeaddress;
    }

   

   

    
}
