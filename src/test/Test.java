/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Nam Nguyen
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String names = "Nam, Truong, Dung, Danh, Tung, Khanh";

        String[] arrayName = names.split(",");

        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(i + 1 + "." + arrayName[i].trim());

        }
    }
}
        
        
    
    
    
    

