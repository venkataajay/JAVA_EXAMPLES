import java.util.HashSet;

public class StringProblem {
    boolean allUnique(String s, int start, int end) {
    	int length = s.length();
        HashSet<Character> set = new HashSet<>();
        for (int i = start; i < length; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) 
            return false;
            set.add(ch);
            System.out.println(set);
        }
        return true;
    }
	
	public int lenghtOfLongestSubString(String s) {
		int n=s.length();
		//System.out.println(n);
		int ans=0;
		for (int i=0;i<n;i++) {
			for (int j =i+1; j<=n; j++) {
	             if (allUnique(s, i, j))
	            	 System.out.println(j);
	            ans = Math.max(ans, j+i);
	            System.out.println(ans);
	             return ans;
	         }

	    
		}
		return n;
		
	}
	public static void main(String[] args) {
		
		String s="abcabcbb";
		StringProblem problem = new StringProblem();
		problem.lenghtOfLongestSubString(s);
	}

}
