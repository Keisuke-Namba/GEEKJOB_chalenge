/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author southkaito
 */
public class Class1 {
    
    String name = "";
    int age = 0;
    String address = null;
    
    void setprofile(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
        
    }
    
    void printProfile(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }





}
