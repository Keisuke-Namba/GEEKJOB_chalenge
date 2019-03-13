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
public class Main2 {
    
    public static void main(String[] args){
        Class2 extend = new Class2();
        extend.setprofile("太郎",21,"東京都");
        extend.printProfile();
        extend.clearProfile();
        extend.printProfile();
    
    }
    
}
