import java.util.Arrays;

public class Runner {

    public static void main(String[] args){
        int[] numbers = {1,3,7,8,9,21,23,45,56};
        System.out.println(binarySearch(8, numbers));
    }

    public static Boolean linearSearch(int searchNumber, int[] sortedArray){
      for(int number : sortedArray) {
          if (number == searchNumber){
              return true;
          }
      }
      return false;
    }

    public static boolean binarySearch(int searchNumber, int[] sortedArray){
        if (sortedArray.length == 0){
            return false;
        }

        int middleIndex = 0;
        if(sortedArray.length > 1){
            middleIndex = sortedArray.length / 2;
        }

        int middleNumber = sortedArray[middleIndex];

        if(searchNumber == middleNumber){
            return true;
        }

        int[] subArray = searchNumber < middleNumber ? Arrays.copyOfRange(sortedArray, 0, middleIndex - 1) : Arrays.copyOfRange(sortedArray, middleIndex + 1, sortedArray.length - 1);

        return binarySearch(searchNumber, subArray);

    }

}
