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
public class time4 {
    
    public static void main(String[] args){
        
      
        Calendar firstCl = Calendar.getInstance();
        Calendar endCl = Calendar.getInstance();
    try{    
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        Date firstDay = sdf.parse("2015/1/1 0:0:0");
        Date endDay = sdf.parse("2015/12/31 23:59:59");
        
        
        firstCl.setTime(firstDay);
        endCl.setTime(endDay);
    
        long fromTime = firstCl.getTimeInMillis();
        long toTime = endCl.getTimeInMillis();
        
        long middleTime = toTime - fromTime;
        
        System.out.println(middleTime);
    
    
    
    }catch(Exception e){ 
        
        System.out.println(e.getMessage());
    }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

