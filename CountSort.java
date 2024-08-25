// import java.util.Arrays;


// public class CountSort {
//     public static boolean chekpost(int newarray[], int value){
//         for(int i=0 ; i<newarray.length ; i++){
//             if(newarray[i]!= value){
//                 return true;
//             }
           

//         }
//         return false;
//     }
//     public static int[] countsort( int array[] ){
//         Arrays.sort(array);
//         int first_counter =0;
//         int new_array[]=new int[array.length];
//         int checkpost[] = new int[array.length];
//         for(int i=0 ; i<array.length ; i++) {
//             int first_element = array[i];
//             for(int j = i ; j<array.length ; j++) {
//                 int second_element = array[j];
//                 if(first_element > second_element && chekpost(new_array, first_counter)) {
//                     first_counter++;

//                 }
//             }
//             checkpost[i]=array[i];
//             first_counter=0;

//         }
//         Arrays.sort(new_array);

//         return new_array;

//     }

//     public static void main(String[] args) {
//       int array[]={ 1 , 2 , 3 , 4, 3 , 2 ,2 ,1};
//       System.out.println(Arrays.toString(countsort(array)));


// }
// }

//new version using hash maps
import java.util.*;

class Main {
//using array 
  public static void countSort(int[] array) {
    if(array == null || array.length <= 1) {
      return;
    }

    int max = array[0];
    for(int num : array) {
      if(num > max) {
        max = num;
      }
    }

    int[] countArray = new int[max + 1];

    for(int num : array) {
      countArray[num]++;
    }

    int index = 0;
    for(int i=0; i<= max; i++) {
      while(countArray[i] > 0) {
        array[index] = i;
        index++;
        countArray[i]--;
      }
    }
    
  }

  //using hashmaps
  public static void countSortHash(int[] arr) {
    if(arr == null || arr.length <= 1) {
      return;
    }
    
    int max = Arrays.stream(arr).max().getAsInt();
    int min = Arrays.stream(arr).min().getAsInt();

    Map<Integer, Integer> countMap = new HashMap<>();

    for(int num : arr) {
      countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    int index = 0;
    for(int i=min; i<=max; i++) {
      int count = countMap.getOrDefault(i, 0);
      for(int j=0; j < count; j++) {
        arr[index] = i;
        index++;
      }
    }

  }
  
  public static void main(String[] args) {
    int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
    countSortHash(arr);
    System.out.println(Arrays.toString(arr));
  }
}




