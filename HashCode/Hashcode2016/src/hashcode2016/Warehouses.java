/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode2016;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author x00126982
 */
public class Warehouses {

    ArrayList<Products> productList = new ArrayList<>();
    int stock;
    String productID;
    int location1, location2;
    double WareHouseLocation[][];

    public Warehouses(int location1, int location2) {
        WareHouseLocation = new double[location1][location2];
    }

    public int getLocation1() {
        return location1;
    }

    public int getLocation2() {
        return location2;
    }
 

    public double[][] getWareHouseLocation() {
        return WareHouseLocation;
    }

}
