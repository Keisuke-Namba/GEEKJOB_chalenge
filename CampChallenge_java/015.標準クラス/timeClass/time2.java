/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeClass;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author southkaito
 */
public class time2 {
    
    public static void main(String[] args){
        
    try{    
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        
        Date now = new Date();
        
        System.out.println(sdf.format(now));
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
        
        
        
        
    }
    
}
