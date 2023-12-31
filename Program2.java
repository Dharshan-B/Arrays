//Sum of all integers in the array
public class Program2{
  public static void main(String[] args){
    int array[] = {45,34,3,23,56,76,43};
    int sum = 0;
    for(int i : array){
      sum += i;
    }
    System.out.println("The Sum is: "+ sum);
  }
}
