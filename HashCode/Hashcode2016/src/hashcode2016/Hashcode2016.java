/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode2016;

import java.util.Scanner;

/**
 *
 * @author x00126982
 */
public class Hashcode2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         int numOfDrones;
         
//         System.out.println("How many Drones");
//         
//          Scanner input = new Scanner(System.in);
//        System.out.println("Enter location 1 ");
//        location1 = input.nextInt();
//        System.out.println("Enter location  ");
//        location2 = input.nextInt();
        
      
        Warehouses w1 = new Warehouses(0,0);
         Drones d1 = new Drones(3,5);
         d1.fly(w1.getLocation1(),w1.getLocation2());
        
    }
    
}
