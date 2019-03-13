/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeClass;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author southkaito
 */
public class time3 {
    
    public static void main(String[] args){
    
    try{
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        
        Calendar cl = Calendar.getInstance();
        cl.set(2016,10,04,10,00,00);
        
        Date theDay = cl.getTime();
        
        
        System.out.println(theDay.getTime());
        System.out.println(sdf.format(theDay));
        
     
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    
    }
}
