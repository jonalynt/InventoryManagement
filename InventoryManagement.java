

// Represents each car entry in the linked list
class InventoryNode {
    String brand;
    String engineNumber;
    String stockStatus;
    String purchaseStatus;
    InventoryNode next;

    public InventoryNode(String brand, String engineNumber, String stockStatus, String purchaseStatus) {
        this.brand = brand;
        this.engineNumber = engineNumber;
        this.stockStatus = stockStatus;
        this.purchaseStatus = purchaseStatus;
        this.next = null;
    }
}

class InventoryLinkedList {
    private InventoryNode head;

    public InventoryLinkedList() {
        this.head = null;
    }

    /** * REVISED: simplistic approach for sorted insertion by brand.
     * Replaces the original "add to head" logic to meet mentor feedback.
     */
    public void addStock(String brand, String engineNumber, String stockStatus, String purchaseStatus) {
        InventoryNode newNode = new InventoryNode(brand, engineNumber, stockStatus, purchaseStatus);

        // Case 1: List is empty or new brand comes alphabetically before head
        if (head == null || brand.compareToIgnoreCase(head.brand) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            // Case 2: Traverse to find the correct alphabetical spot (Ascending Order)
            InventoryNode current = head;
            while (current.next != null && current.next.brand.compareToIgnoreCase(brand) < 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Standard Delete by Engine Number
    public void deleteStock(String engineNumber) {
        InventoryNode temp = head, prev = null;
        if (temp != null && temp.engineNumber.equals(engineNumber)) {
            head = temp.next;
            return;
        }
        while (temp != null && !temp.engineNumber.equals(engineNumber)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    // Standard Search by Engine Number
    public InventoryNode searchStock(String engineNumber) {
        InventoryNode current = head;
        while (current != null) {
            if (current.engineNumber.equals(engineNumber)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Display entire inventory
    public void displayInventory() {
        InventoryNode temp = head;
        while (temp != null) {
            System.out.println("Brand: " + temp.brand + " | Engine: " + temp.engineNumber + 
                               " | Status: " + temp.stockStatus + " | Purchase: " + temp.purchaseStatus);
            temp = temp.next;
        }
    }
}


public class InventoryManagement {
    public static void main(String[] args) {
        InventoryLinkedList list = new InventoryLinkedList();
        
        // Items added out of order to demonstrate automatic sorting
        list.addStock("Toyota", "T101", "In Stock", "Paid");
        list.addStock("Audi", "A505", "In Stock", "Paid");
        list.addStock("BMW", "B202", "Sold", "Pending");

        System.out.println("--- Current Inventory (Sorted Alphabetically by Brand) ---");
        list.displayInventory();
    }
}