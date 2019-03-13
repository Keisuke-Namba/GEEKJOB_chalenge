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
abstract public class Human {
    
    ArrayList<Integer> myCards = new ArrayList<Integer>();
    
    
    abstract public int open(); //手札の合計値を計算するメソッド　メソッドの戻り値は手札の合計
    
    public abstract void setCard(ArrayList<Integer> al);//引いたカードを手札に追加するメソッド。(疑問)ArrayListを引数にするとは？
    
    abstract public boolean checkSum();//まだカードを引くべきか判断するメソッド。true or falseが戻り値
    
    
}
