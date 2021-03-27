/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Scanner;

/**
 *
 * @author Digital
 */
public class Reverse {
    
    public static void main(String[] args) {
        
        int sum =0,temp,num,r;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any number");
        num = input.nextInt();
        
        temp = num;
        while(temp !=0)
            
        {
          r= temp %10;
          sum = sum *10+r;
          temp = temp /10;
          
        }
        
        System.out.println("The Reverse number :"+sum);
    }
    
}
