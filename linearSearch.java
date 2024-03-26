public class linearSearch {
    public static void main(String arg[]){
        int nums[]={1,2,3,4,5,6,7,8};
        int target=6;

        int result=linear_search(nums, target);
        if(result!=-1)
        {
            System.out.println("Element found at index: "+result);
        }
        else
        {
            System.out.println("Element not found!");
        }

    }

    public static int linear_search(int nums[], int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}

