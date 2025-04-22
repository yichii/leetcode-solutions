public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        while (n > 0) {
            int i = 0;
            if ((flowerbed[i + 1] == 0) && (flowerbed[i] == 0)) {
                n--;
            }

            if (i == flowerbed.length - 1) {

            } else {

            }
            i++;
        }
        
        return false;
    }
}
