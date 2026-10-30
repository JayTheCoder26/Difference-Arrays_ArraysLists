import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Arrays have a fixed size.
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("ARRAY EXAMPLE");

        // Display the original array.
        System.out.println("Original Array: "
                + Arrays.toString(numbers));

        // Change an existing array element.
        numbers[2] = 35;

        System.out.println("Updated Array: "
                + Arrays.toString(numbers));

        // Arrays use length to determine their size.
        System.out.println("Array Size: "
                + numbers.length);

        System.out.println();

        // ArrayLists can grow or shrink dynamically.
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("ARRAYLIST EXAMPLE");

        // Add elements using the add() method.
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("Original ArrayList: "
                + numberList);

        // Add another element to increase the size.
        numberList.add(60);

        System.out.println("After Adding: "
                + numberList);

        // Remove an element from the ArrayList.
        numberList.remove(Integer.valueOf(20));

        System.out.println("After Removing: "
                + numberList);

        // ArrayLists use size() instead of length.
        System.out.println("ArrayList Size: "
                + numberList.size());

        // Access an element using get().
        System.out.println("First Element: "
                + numberList.get(0));

        System.out.println();

        // Explain the main difference.
        System.out.println("MAIN DIFFERENCE");

        System.out.println(
                "Arrays have a fixed length.");

        System.out.println(
                "ArrayLists can grow and shrink.");
    }
}
