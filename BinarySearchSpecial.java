public class Midterm {
    public int binarySearch(int[] nums, int target, boolean inclusive) {
        int l = 0;
        int r = nums.length - 1;

        return binarySearch2(nums, l, r, target, inclusive);
    }

    int binarySearch2(int arr[], int l, int r, int x, boolean inclusive)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x) {
                if(inclusive==true) {
                    return mid;
                }
                else {
                    if(mid+1 <= r) {
                        return mid + 1;
                    }
                    else {
                        return mid;
                    }
                }
            }

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch2(arr, l, mid - 1, x, inclusive);

            // Else the element can only be present
            // in right subarray
            return binarySearch2(arr, mid + 1, r, x, inclusive);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }


    public static void main(String[] args) {
        Midterm midterm = new Midterm();
        System.out.println(midterm.binarySearch(new int[]{1, 2, 3, 4}, 2, true));//should be 1
        System.out.println(midterm.binarySearch(new int[]{1, 2, 3, 4}, 2, false));//should be 2
    }
}