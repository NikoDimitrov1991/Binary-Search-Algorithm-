public class BS {
    int binarySearch(int[] arr, int leftSide, int rightSide, int numberWeAreLookingFor){
        if (rightSide >=leftSide) {
            int middleOfList = leftSide + (rightSide - leftSide) / 2;

            //If the element is present at the middle itself
            if (arr[middleOfList] == numberWeAreLookingFor)
                return middleOfList;
            //If element is smaller than middleOfList, than we go to the left side
            if (arr[middleOfList] > numberWeAreLookingFor)
                return binarySearch(arr, leftSide, middleOfList - 1, numberWeAreLookingFor);

            //If the element is larger than X, than we go to the right side
            return binarySearch(arr, middleOfList + 1, rightSide, numberWeAreLookingFor);
        }
        //If the element is not present in the array we return -1
        return -1;
    }

    public static void main(String[] args) {
        BS binary = new BS();
        int[] arr = {2,10,11,34,80,99};
        int x = 99;
        int result = binary.binarySearch(arr,0,arr.length-1,x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present at index    " + result);
        }
    }
}
