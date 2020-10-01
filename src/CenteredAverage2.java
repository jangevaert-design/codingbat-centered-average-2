public class CenteredAverage2 {
  public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];

    int result = 0;

    for (int i = 0; i < nums.length; i++) {
      result += nums[i] ;

      max = Math.max(max, nums[i]);
      min = Math.min(min, nums[i]);

    }
    return (result - max - min) / (nums.length - 2);
  }
}
