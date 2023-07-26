public class TestMyArray {
    public static void main (String[] arg)
    {
        int n = GetData.getInt("What is the size of the array?");
        MyArray m = new MyArray(n);
        m.loadArray();
        System.out.println("The Size of my array is: " + m.arraySize());
        System.out.println("Original order \n" + m.inOrder());
        System.out.println("Reverse order \n" + m.reverseOrder());
    }
}
