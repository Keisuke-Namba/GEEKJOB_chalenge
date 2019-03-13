/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;
import java.io.*;

/**
 *
 * @author southkaito
 */
public class File0 {
    
    public static void main(String[] args){
    
    try{
        File fp = new File("name.txt");
        FileWriter fw = new FileWriter(fp);
        
        fw.write("南葉圭祐 年齢は２２歳です。また今プログラミングを勉強している理由はそれが経済的な自由を獲得する方法だと思っているからです。大学院に行きもっと人工知能を勉強していきたいです。");
        fw.close();
    
    
    
    
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    
}
}
