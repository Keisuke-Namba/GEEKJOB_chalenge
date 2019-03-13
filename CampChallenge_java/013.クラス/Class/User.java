/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.ArrayList;

/**
 *
 * @author southkaito
 */
public class User extends Human{
    
   
    
    public int open(){
        return getTotal();
    }
    
    public void setCard(ArrayList<Integer> al){
        if(al != null){
            for(Integer card : al){
                this.myCards.add(card);
            }
            
        }
    }
    
    public boolean checkSum(){
        //解答に模範して書けば15で止める。
        Integer Sum = getTotal();
        if(Sum < 17){
            return true;
        }
    return false;
    }
    
    private Integer getTotal(){
    Integer total = 0;
    if(this.myCards != null){
        int aceCnt = 0;
        for(Integer card : this.myCards){
            if(card != 1){
                //１以外を加算
                total += card;
            }else{
                aceCnt++;
                
            }
        }
        if(aceCnt > 0){
            if(aceCnt > 1){
                //1枚以上1の場合は、１枚残してすべて1
                total += (aceCnt - 1);
            }
            
            if((total+11) <= 21){
                total += 11;
            }else{
                total += 1;
            }
            }
    }
    
    return total;
    
    }

    
    
    
    
    
    
}
