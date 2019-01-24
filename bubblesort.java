import java.util.*;
public class bubblesort{
  public static void main(String[]args){
    int array[] = {12, 8, 7, 5, 2};
    int tmp = 0;
    int n = array.length;
    for(int i = 0; i < n; i++){
      for(int j = 1; j < n-i; j++){
        if(array[j-1]>array[j]){
          tmp = array[j-1];
          array[j-1] = array[j];
          array[j] = tmp;
        }
      }
    }
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}
