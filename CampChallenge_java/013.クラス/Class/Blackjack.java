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
public class Blackjack {
    
    public static void main(String[] ages){
    
    // DealerとUserの初期化
    Dealer dealer = new Dealer();
    User user = new User();
    
    
    dealer.setCard(dealer.deal());  //ディーラー側が二枚引く
    user.setCard(dealer.deal()); //ユーザー側が二枚引く
    
    //どちらかがカードを必要とするまで引く
    while(dealer.checkSum() || user.checkSum()){ // while文の中は条件式よりtrueの限り続く
        if(dealer.checkSum()){
            dealer.setCard(dealer.hit());
        }
        if(user.checkSum()){
            user.setCard(dealer.hit());
        }
    
    
    System.out.println("ディーラー："+dealer.myCards.toString()+"　ユーザー："+user.myCards.toString());
    }
    
    //両方でそろったら結果を表示
    
    Integer dealerTotal = dealer.open();
    Integer userTotal = user.open();
    
    System.out.println("ディーラー="+dealerTotal+" "+dealer.myCards.toString()+"　ユーザー="+userTotal+" "+user.myCards.toString());
    
    
    //ここからは判定の表示方法
    
    if(dealerTotal > 21){dealerTotal = 0;}
    if(userTotal > 21){userTotal = 0;}
    
    if(dealerTotal == userTotal){
        if(dealerTotal == 21){
            if(dealer.myCards.size() > user.myCards.size()){
                System.out.println("ユーザーwin");
            }else if(dealer.myCards.size() < user.myCards.size()){
                System.out.println("ユーザーlose");
            }else{
                System.out.println("引き分け");
            }
                
        }else{
            System.out.println("引き分け");
        }
    }else if(userTotal > dealerTotal){
        System.out.println("ユーザーwin");
    }else{
        System.out.println("ユーザーlose");
    }
    
    
    
    }
    
    }
