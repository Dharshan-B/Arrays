public class Program4 {
    public static void main(String args[]) {
      int sum =0,Average =0;
      int Avg[] = {45,34,23,23};
      for(int i =0; i < Avg.length;i++){
          sum += Avg[i];
      }
      Average = sum /Avg.length;
      System.out.println(""+Average);
    }
}
