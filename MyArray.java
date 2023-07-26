//Chapter 8 - Arrays and Array Manipulations

// Exercise 8.4
// Read an integer value, representing the size of an integer array called numbers. Use this number to create the array. Read that many values into the array, and display the values:
// a. In the order in which they were read
// b. In the reverse order of how there were read

// Note:
// Write the leading class called MyArray. Its constructor accepts an integer value, representing the size of the array, and uses this value to create the array. Write a mutator method called loadArray to reads the values into the array; and two accessor methods - one which returns the array values in the order that they were read, and the other in the reversed order of how they were read. The test class reads the size of the array and passes it to the constructor of MyArray; it also called the method for loading the array, and those for displaying the array values. 

// CLASS DIAGRAM FOR MyArray:
// Size: int
// numbers: int[n]
// MyArray(n: int)
// loadArray(): void
// getArraySize(): int
// inOrder(): String
// reverseOrder(): String

// Note:
// The constructor will create the array using parametric values received. The method loadArray() reads the values one by one and stores them in the array as they are read, accessed serially. A for loop is an ideal iterative construct to us. A for loop can also be used when displaying values in their stored order and reversed order.

public class MyArray {
    int size; // Variable to hold the size of the array
    int numbers[]; // The array variable

    public MyArray(int n) {
        size = n;
        numbers = new int[n]; // Creating the array
    }

    public void loadArray() // This method reads n values in the array
    {
        for (int i = 0; i < size; i++)
            numbers[i] = GetData.getInt("Enter an integer value");
    }

    int arraySize() // Return the size of the array
    {
        return size;
    }

    public String inOrder() // Retrieve the values in order of how they were read
    {
        String s = "";
        for (int i = 0; i < size; i++)
            s = s + numbers[i] + "\n";
        return s;
    }

    public String reverseOrder() // Retrieve values in reverse order of how they were read
    {
        String s = "";
        for (i = size - 1; i >= 0; i--)
            ;
        s = s + numbers[i] + "\n";
        return s;
    }
}