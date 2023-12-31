//Write a Java program to print the grid.
import java.util.Arrays;
public class program3{
    public static void main(String[] args){
        int grid[][] = new int[10][10];
        //Outer Loop
        for(int i =0;i < grid.length;i++){
            //Inner Loop
            for(int j=0 ;j < grid[i].length;j++){
                System.out.print("-\t");
            }
            System.out.println();
        }
    }
}
