import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        LongestConsecutive lc = new LongestConsecutive();
        System.out.println(lc.longestConsecutive(nums));
    }
}
