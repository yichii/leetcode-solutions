import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,2,3};
        int k = 2;
        TopKFrequent tkf = new TopKFrequent();
        System.out.println(Arrays.toString(tkf.topKFrequent(nums, k)));
    }
}
