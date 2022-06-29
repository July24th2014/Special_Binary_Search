# Special_Binary_Search

Please implement a special binary search method: binarySearch(int[] nums, int target, boolean inclusive).

Input:
"nums" is a sorted int array which may contain duplicate values, e.g., [1, 3, 3, 4];
"target" is the target value for you to search for;
"inclusive" is a control flag.
Output: the target index.

Description:
When inclusive = true, return the index of the RIGHT MOST target value.
When inclusive = false, return the index of the LEFT MOST value that is STRICTLY GREATER than the target value.
If the requested value doesn't exist in the input array, return -1.
  
Examples:

binarySearch(int[]{1, 3, 3, 4}, 3, true) returns 2 because the index of the right most 3 is 2.
binarySearch(int[]{1, 3, 3, 4}, 3, false) returns 3 because the left most value that is greater than 3 is 4.
binarySearch(int[]{1, 2, 2, 2}, 3, true) returns -1 because the target value 3 doesn't exist.
binarySearch(int[]{1, 2, 2, 2}, 2, false) returns -1 because the left most value that is greater than 2 doesn't exist.
