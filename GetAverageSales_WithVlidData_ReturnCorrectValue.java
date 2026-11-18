/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
@Test
public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

    String[] products = {
        "Cozy Nights Monarch mattress",
        "Restonic Barbados mattress",
        "Sealy Phuket mattress"
    };

    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    Product product = new Product(products, sales);

    assertEquals(17.0, product.GetAverageProductsSold());
}
    
