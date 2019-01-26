import java.util.*;
public class selectionsort{
  public static void main(String[]args){
    int array [] = {10, 2, 8, 6, 7, 3};
    int n = array.length;
    for(int i = 0; i < n-1; i++){
      int minIndex = i;
      for(int j = i + 1; j < n; j++){
        if(array[j] < array[minIndex]){
          minIndex = j;
        }
      int tmp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = tmp;
    }
  }
    for(int i = 0; i < n; i++){
      System.out.print(array[i] + " ");
  }
}
}
