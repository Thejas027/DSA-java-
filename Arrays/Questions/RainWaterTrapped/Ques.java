package Arrays.Questions.RainWaterTrapped;
public class Ques {

    public static int RainWaterTrapped(int height[]) {
        // calculate left max-boundrary of an array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max-boundrary of an array
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        int trappedWater = 0;
        for (int i = 0; i < height.length; i++) {
            // waterLevel = min(leftMaxBound,RightMaxBound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int res = RainWaterTrapped(height);
        System.out.println(res);
    }
}
