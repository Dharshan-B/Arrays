//Sorting a numeric array and a string array
import java.util.Arrays;
public class Program1{
  public static void main(String[] args){
    //Sorting of Numbers
    int[] array = {4,5,23,232,23,34,57,33};
    System.out.println("Original Array: "+Arrays.toString(array));
    Arrays.sort(array);
    System.out.println("Sorted Array: "+Arrays.toString(array));
    //Sorting of Strings
    String[] array1 = {"dharshan","durga","chintu"};
    System.out.println("Original Array: "+Arrays.toString(array1));
    Arrays.sort(array1);
    System.out.println("Sorted Array: "+Arrays.toString(array1));
  }
}
