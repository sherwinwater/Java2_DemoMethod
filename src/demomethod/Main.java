package demomethod;

import content.TheArray;

public class Main {

    public static void main(String[] args) {

        int[] iNumbers = {2, 4, 5, 6};
        System.out.println("input is ");
        System.out.println(TheArray.printArray(iNumbers));

        TheArray.fillArray(iNumbers);
        System.out.println("fill array is ");
        System.out.println(TheArray.printArray(iNumbers));

        TheArray.startArray(5);
        System.out.println("start array is ");
        System.out.println(TheArray.printArray(iNumbers));
        System.out.println(TheArray.printArray(TheArray.startArray(5)));

    }
}
/*
Array Method Homework

1.	Create a project called DemoMethod
2.	To the project add a folder called content that contains a class called TheArray.
3.	To TheArray, add a public static method called printArray that
a.	Takes an integer array
b.	Uses a loop to build a String contains all of the elements of the array parameter
c.	Returns the String
4.	In main method, demonstrate the use of the printArray method of TheArray
5.	In TheArray class, add a public static method called fillArray that
a.	Does not return anything
b.	Takes an integer array as a parameter
c.	Fills the array with 0,1,2,3
6.	In main method, demonstrate the use of the fillArray method.
7.	To TheArray class, add a public static method called startArray that
a.	Takes an integer parameter called size
b.	Creates an integer array of the parameter size
c.	Fills the array with 0,1,2,3 etc.
d.	Returns the array
8.	In main method, demonstrate the use of startArray


*/
