package com.driver;
class Product {
    public int product(int x, int y) {
        return 0;
    }
    public int product(int x, int y, int z) {
        return 0;
    }
    public double product(double x, double y) {
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(1,2);
        p.product(1,2,3);
        p.product(1.2, 2.3);
    }
}