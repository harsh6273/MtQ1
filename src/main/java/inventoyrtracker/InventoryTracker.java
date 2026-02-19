/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package inventoyrtracker;

/**
 *
 * @author harsh
 */
public class InventoryTracker {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
        public int checkStockLevel(String productId) {

        return 0;
    }
        public void alertLowStock(String productId, int stockLevel) {
       if (stockLevel <= 5) {
        System.out.println("ALERT: Low stock for " + productId + " (Remaining: " + stockLevel + ")");
    }
}
}
