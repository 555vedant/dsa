package hashmaps;
import java.util.Scanner;


/**
 * custamisedhashmaps
 */
// public class CustomizedHashMaps {
//     public Integer size;
//     public Integer[] data;

//     public CustomizedHashMaps(int size) {
//         this.size = size;
//         this.data = new Integer[size]; // Initialize the array with the specified size
//     }

//     public void insert(int value) {
//         int index = value % size;
//         int i = 0;
//         if (this.data[index] == null) {
//             this.data[index] = value;
//         } else {
//             // Apply linear probing 
//             while (this.data[(index + i) % size] != null) {
//                 i++;
//             }
//             this.data[(index + i) % size] = value;
//         }
//     }

//     // Method for removing element from the hashmap
//     public void remove(int index) {
//         if (index >= 0 && index < size) {
//             this.data[index] = null;
//         } else {
//             System.out.println("Index out of bounds.");
//         }
//     }

//     // Function for displaying the hashmap
//     public void display() {
//         for (int i = 0; i < size; i++) {
//             System.out.println(this.data[i]);
//         }
//     }
// }

import java.util.Scanner;

public class CustomizedHashMaps {
    private int size;
    private Integer[] data;

    public CustomizedHashMaps(int size) {
        this.size = size;
        this.data = new Integer[size];
    }

    public void insert(int value) {
        int index = hashFunction(value);
        int i = 0;
        while (data[index] != null) {
            index = (index + i) % size;
            i++;
            if (i >= size) {
                System.out.println("HashMap is full.");
                return;
            }
        }
        data[index] = value;
    }

    public void remove(int value) {
        int index = hashFunction(value);
        int i = 0;
        while (data[index] != null) {
            if (data[index] == value) {
                data[index] = null;
                System.out.println("Element removed successfully.");
                return;
            }
            index = (index + i) % size;
            i++;
            if (i >= size) {
                System.out.println("Element not found in the HashMap.");
                return;
            }
        }
        System.out.println("Element not found in the HashMap.");
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (data[i] != null) {
                System.out.println("Index " + i + ": " + data[i]);
            }
        }
    }

    private int hashFunction(int value) {
        return value % size;
    }

    public static void main(String[] args) {
        CustomizedHashMaps hashMap = new CustomizedHashMaps(10);

        hashMap.insert(5);
        hashMap.insert(10);
        hashMap.insert(15);
        hashMap.insert(20);
        hashMap.insert(25);

        hashMap.display();

        hashMap.remove(10);
        hashMap.remove(15);

        hashMap.display();
    }
}