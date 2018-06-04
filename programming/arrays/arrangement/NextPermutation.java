// https://www.interviewbit.com/problems/next-permutation/

public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	   
	   int i = a.size() - 2;
        while (i >= 0 && a.get(i + 1) <= a.get(i)) {
            i--;
        }
        if (i >= 0) {
            int j = a.size() - 1;
            while (j >= 0 && a.get(j) <= a.get(i)) {
                j--;
            }
            swap(a, i, j);
        }
        reverse(a, i + 1);
	}
	
	private void reverse(ArrayList<Integer> nums, int start) {
        int i = start, j = nums.size() - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(ArrayList<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }
}


