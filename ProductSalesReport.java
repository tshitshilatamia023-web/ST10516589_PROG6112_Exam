/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ProductSalesReport {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        // 2D array: 3 products x 3 months
        int[][] sales = new int[3][3];

        // Enter sales for each product
        for (int i = 0; i < products.length; i++) {

            for (int month = 0; month < 3; month++) {

                System.out.print(
                    "Enter number of sales for month "
                    + (month + 1) + " for "
                    + products[i] + ": "
                );

                sales[i][month] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(products, sales);

        // Create PrintProduct object
        PrintProduct report = new PrintProduct(product);

        // Display report
        report.printReport();

        input.close();
    }
}
   
