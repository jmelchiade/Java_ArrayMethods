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
        for (int i = size - 1; i >= 0; i--)
            ;
        s = s + numbers[j] + "\n";
        return s;
    }
}

// Notes:
// Line 24 shows the variable, "size", that will store the size of the array to
// be created.
// line 25 shows the declaration of the array reference called numbers. Java
// does not support specifying the array size in the declaration
// The creation of the array is shown on the right of the assignment operator of
// line 35. The array has already been declared. Instead of re-declaring, a
// reference is assigned.
// The method loadArray() shown on line 32 uses the for loop to access the array
// serially. For each interaction in the loop, the value that is read is
// assigned to the respective index of the array.
// The method inOrder() retrieves the cell values and appends it to the string
// variable, "s". The loop control variable is used as the index of the array,
// shown on line 47.
// Finally, the method reverseOrder() retrieves each array element in the
// reverse order of how they were originally stored. The loop control variable
// starts with the last value, a size of -1. That's because if the size of the
// array is used the upper boundary of the array would have been breached and
// the code would not compile. See line 54.