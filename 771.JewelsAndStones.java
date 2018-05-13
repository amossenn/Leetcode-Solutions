class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum = 0;
	//Use a HashMap to reduce runtime to O(N)
        HashMap jewels = new HashMap();
        for(int index = 0; index < J.length(); index++){
	    //Put jewels in HashMap
            jewels.put( (int) J.charAt(index), J.charAt(index));
        }
        
        for(int index = 0; index < S.length(); index++){
	    //If a letter in a Stone is a jewel in our HashMap, add to sum
            if(jewels.containsValue(S.charAt(index))){
                sum++;
            }
        }
	//Return sum
        return sum;
    }
}
