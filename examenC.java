Java by Example: Arrays
In Java, an array is a container object that holds a fixed number of values of a single type. The length of the array is established when the array is created and array length is fixed.

public class Main {
public static void main(String[] args) {
Here we declare an array of integers. The type of elements and size are both part of the array's type. By default an array is filled with the default value of the type, which for ints means 0s.

    int[] anArray = new int[10];
    System.out.println(Arrays.toString(anArray));
We can set a value at an index using the array[index] = value syntax, and get a value with array[index].

    anArray[4] = 100;
    System.out.println(Arrays.toString(anArray));
    System.out.println("Element at index 4: " + anArray[4]);
The property length returns the length of an array.

    System.out.println("Length: " + anArray.length);
You can initialize an array in one line.

    int[] b = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(b));
We can iterate over an array using a for-each loop. The for-each loop iterates over each element of the array, from the first (index 0) to the last.

    for (int number : b) {
        System.out.println(number);
    }
You can also use a for loop to iterate over an array by index.

    for (int i = 0; i < b.length; i++) {
        System.out.println(b[i]);
    }
Arrays in Java have a fixed size. However, if you need a dynamically sized array, you might want to use the ArrayList class in the Java Collections Framework.

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    System.out.println(arrayList);
We can also declare multidimensional arrays in Java. Here's a two-dimensional array (an array of arrays).

    int[][] twoDArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    for (int[] row : twoDArray) {
        System.out.println(Arrays.toString(row));
    }
  }
}
Next: Loops in Java
