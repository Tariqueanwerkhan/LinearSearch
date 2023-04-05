public class LinearSearchCode {
    public static void main(String[] args) {
        int[] nums = {23, 45, 32, 11, 30, 2, 3, -6, -10, -23, -1, -9};
        int target = -6;//-6 is at index number 7. so it should print index number 7
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in the array: return the index if item found
    //otherwise if item not found: return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target no found
        return -1;
    }
}
