

public class ContinuousArrays {

    public static void main(String[] args) {
        ContinuousArrays arrSum = new ContinuousArrays();
        int arr[] = {14,12,70,15,99,65,32,90};
        int length = arr.length;
        int sum = 97;
        arrSum.ArraySum(arr,length,sum);

    }

    int ArraySum(int arr[], int length, int sum){
        int currentSum;
        for (int i =0; i < length; i++){
            currentSum = arr[i];
            for(int j = i + 1; j <= length; j++){
                if(currentSum == sum){
                    int end = j-1;
                    System.out.println("Sum was found between the indexes of " + i + " and " + end);
                    return 1;
                }
                if(currentSum > sum || j == length)
                    break;
                currentSum = currentSum + arr[j];
            }
        }
        System.out.println("Sum could not be found");
        return 0;
    }
}
