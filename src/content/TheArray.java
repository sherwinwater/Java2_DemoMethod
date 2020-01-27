package content;

public class TheArray {

    public static String printArray(int[] iNumbers) {

        String elements = new String();
        for (int sub = 0; sub < iNumbers.length; sub++) {
            elements += "Elements[" + sub + "] is: " + iNumbers[sub] + "\n";
        }
        return elements;
    }

    public static void fillArray(int[] numbers) {
        for (int sub = 0; sub < numbers.length; sub++) {
            numbers[sub] = sub;
        }
    }

    public static int[] startArray(int size) {
        int[] numbers = new int[size];
        for (int sub = 0; sub < size; sub++) {
            numbers[sub] = sub;
        }
        return numbers;
    }
   
}
