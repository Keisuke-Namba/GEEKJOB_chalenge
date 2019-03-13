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
public class file1 {
    public static void main(String[] args){
    
    try{    
        
        File fp = new File("name.txt");
        //FileReaderクラスの作成
        FileReader fr = new FileReader(fp);
        //BufferedReaderクラスの作成
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(br.readLine());
        
        fr.close();
        
    
    
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
    
}
}
