/*create class product(pid,price,quantity) with parameterized constructor.
create a main function in diffrent class and perform the following task.
a)accept five product information from user and store in a array.
b)find pid of the product with highest price.
c)create a method with array of products object as argument in class to calculate and 
return the total amount spent on all products. 
		amount spent on single product=price of product*quantity of product.*/
package oopstask;

import java.util.Scanner;
class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for pid
    public int getPid() {
        return pid;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Method to calculate and return the total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;

        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }

        return totalAmount;
    }
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Accept five product information from the user and store in an array
        Product[] products = new Product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();

            // Creating a Product object and storing it in the array
            products[i] = new Product(pid, price, quantity);
        }

        // Find PID of the product with the highest price
        int maxPricePid = findMaxPricePid(products);
        System.out.println("Product with the highest price has PID: " + maxPricePid);

        // Calculate and display the total amount spent on all products
        double totalAmount = Product.calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    // Helper method to find PID of the product with the highest price
    private static int findMaxPricePid(Product[] products) {
        int maxPricePid = -1;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                maxPricePid = product.getPid();
            }
        }

        return maxPricePid;
	}

}
