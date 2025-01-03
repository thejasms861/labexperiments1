import java.util.Arrays;

class Sort {
    // Generic method to arrange (sort) the array
    public <T extends Comparable<T>> void Arrange(T[] array) {
        Arrays.sort(array);
    }

    // Generic method to display the array
    public <T> void Display(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

public class GenericSortExample {
    public static void main(String[] args) {
        Sort sorter = new Sort();
        
        // Integer array
        Integer[] intArray = {5, 3, 8, 1, 9};
        System.out.println("Original Integer Array: ");
        sorter.Display(intArray);
        sorter.Arrange(intArray);
        System.out.println("Sorted Integer Array: ");
        sorter.Display(intArray);
        
        // String array
        String[] strArray = {"Banana", "Apple", "Cherry", "Date"};
        System.out.println("\nOriginal String Array: ");
        sorter.Display(strArray);
        sorter.Arrange(strArray);
        System.out.println("Sorted String Array: ");
        sorter.Display(strArray);
        
        // Double array
        Double[] doubleArray = {2.5, 3.7, 1.2, 4.8, 0.9};
        System.out.println("\nOriginal Double Array: ");
        sorter.Display(doubleArray);
        sorter.Arrange(doubleArray);
        System.out.println("Sorted Double Array: ");
        sorter.Display(doubleArray);
    }
}


