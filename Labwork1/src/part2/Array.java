/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tanujkodali
 */
public class Array {
    public static void main(String[] args)   
{  
    
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter the number of elements you want ");
        int Num = input.nextInt();
        int Number[] = new int[Num];

        for (int i = 0; i < Num; i++) {
            System.out.println ("number" + i + ":");
            Number[i] = input.nextInt();
        }

        for (int temp : Number){
            System.out.print (temp + "\t");
        }
for (int i = 0; i < Number.length; i++) {
      if (i % 2 == 0) {
        Number[i] =  Number[i]*2;
      } else {
        Number[i] = Number[i]*3;
      }
    }

    System.out.println("array after conversion is : " + Arrays.toString(Number));
  }
}
       
    
