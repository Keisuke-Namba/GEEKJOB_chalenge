/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.ArrayList;
import java.util.Random;
        
  

/**
 *
 * @author southkaito
 */
public class Dealer extends Human { //コンストラクタ
    
    ArrayList<Integer> cards = new ArrayList<Integer>(); //cardsはデッキのカード 
    
    Dealer(){  //山札にすべてのカードを追加 //コンストラクタ
        
        for(int mark = 1;mark <= 4;mark++){
            for(int num = 1;num <=13;num++){
                if(num>10){
                    cards.add(10);
                }else{
                    cards.add(num);  //10以上だとすべて10の数になる。１だと1or11になる。
                }
            }
        }
        
    }

    public int open(){ //手札の合計値の計算
         return getTotal();
    }
    
    public void setCard(ArrayList<Integer> al){ //alは受け取ったカードを手札に追加するもの
        if(al != null){
            for(Integer card : al){
                this.myCards.add(card);
            }
        }
        
    }
    
    public boolean checkSum(){
        //Dealerは17で止める
        Integer sum = getTotal();
        if(sum < 17){
            return true;
        }
        return false;
    }
 
    
    
    public ArrayList<Integer> deal(){   //山札からカードをランダムに２枚引き引いたカードを戻り値にする
        
      ArrayList<Integer> resultCard = new ArrayList<Integer>();
        
        Random rnd = new Random();
        for(int i =0;i < 2;i++){
            Integer target = rnd.nextInt(this.cards.size());
            resultCard.add(this.cards.get(target));
            //使用したカードはデッキから破棄
            this.cards.remove(target);
        }
        
        return resultCard;
    }
        
        
  
    
    
    
    
    
    public ArrayList<Integer> hit(){ //山札からランダムに１枚引き引いたカードを戻り値にする
        
      ArrayList<Integer> resultCard = new ArrayList<Integer>();
        
        Random rnd = new Random();
        Integer target = rnd.nextInt(this.cards.size());
        
        resultCard.add(this.cards.get(target));
        
        //使用したカードは破棄
        this.cards.remove(target);
        
        return resultCard;
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
        
    






 

  
    
