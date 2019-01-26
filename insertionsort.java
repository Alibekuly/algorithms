import java.util.*;
public class insertionsort{
  public static void main(String[]args){
    int array [] = {10, 2, 8, 6, 7, 3};
    int n = array.length;
    for (int i = 0; i < n; i++){
      int current = array[i];
      int j = i - 1;
        while (j>= 0 && array[j] > current){
          array[j+1] = array[j];
          j = j - 1;
        array[j+1] = current;
        }
      }
        for(int i = 0; i < n; i++){
          System.out.print(array[i] + " ");
    }
  }
}
