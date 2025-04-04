import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < candies.length; i++) {
            boolean isGreatest = (candies[i] + extraCandies) >= maxCandy;
            if (isGreatest) {
                result.add(true);
            } else {
                result.add(false); 
            }
        }
        
        return result;
    }
}
