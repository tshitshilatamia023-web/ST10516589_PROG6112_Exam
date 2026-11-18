/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    @Override
    public double GetAverageProductsSold() {

        int total = GetTotalProductsSold();

        int numberOfSales = sales.length * sales[0].length;

        return (double) total / numberOfSales;
    }

    @Override
    public String GetMostPopularProduct() {

        int highestTotal = 0;
        String popularProduct = "";

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestTotal) {
                highestTotal = productTotal;
                popularProduct = products[i];
            }
        }

        return popularProduct + " (" + highestTotal + ")";
    }
}
    

