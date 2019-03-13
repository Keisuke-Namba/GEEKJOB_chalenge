/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeClass;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 *
 * @author southkaito
 */
public class time1 {
    
    public static void main(String[] args){
        
    try{    
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date theDay = sdf.parse("2016/1/1 12:31:50");
        
        System.out.println(theDay.getTime());
    }catch(Exception e){
    System.out.println(e.getMessage());
    
}
    
    }
}
