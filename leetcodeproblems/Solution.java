import java.util.Arrays;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] n = new int[2];
        for (int i=0;i<numbers.length-1;i++) {
        	//System.out.println(i);
            for(int j=i+1;j<numbers.length;j++) {
            	System.out.println(j);
                if(target ==(numbers[i]+numbers[j])) {
                    n[0] = i;
                    n[1] = j;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] s = {2,7,11,15};
        int value = 9;
        Solution sol= new Solution();
        int[] a = sol.twoSum(s,value);
        System.out.println(Arrays.toString(a));
    }
}