/**
 * author:      SaiL1020
 * time:        4/6/17 12:49 AM
 * project:     ToLearn
 */
public class MergeSort {
    private void sort(int[] nums) {
        int[] temp = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, temp);
    }

    private void mergeSort(int[] nums, int ll, int rr, int[] temp) {
        if (ll >= rr) return ;
        int mid = ll + (rr - ll) / 2;
        mergeSort(nums, ll, mid, temp);
        mergeSort(nums, mid + 1, rr, temp);
        merge(nums, ll, mid, rr, temp);
    }

    private void merge(int[] nums, int ll, int mid, int rr, int[] temp) {
        int index = ll;
        int left = ll;
        int right = mid + 1;
        while (left <= mid && right <= rr)
            temp[index++] = (nums[left] <= nums[right]) ? nums[left++] : nums[right++];
        while (left <= mid) temp[index++] = nums[left++];
        while (right <= rr) temp[index++] = nums[right++];
        System.arraycopy(temp, ll, nums, ll, rr - ll + 1);
    }

    private void run() {
        int[] nums = new int[] {5, 1, 7, 3, 4, 2, 6, 5, 6};
        sort(nums);
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new MergeSort().run();
    }
}
