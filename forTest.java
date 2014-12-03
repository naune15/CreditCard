import java.util.Scanner;
public class forTest
{
  public static void main(String[] args)
  {
    int[] intArray = {1, 3, 5, 7, 9};
    double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
    System.out.println("The integer array length is " + intArray.length + ".");
    for (int i = 0; i < intArray.length; i++)
    {
      System.out.println("Index " + i + " is " + intArray[i] + ".");
    }
    for (double array : doubleArray)
    {
      System.out.println(array);
    }
  }
}