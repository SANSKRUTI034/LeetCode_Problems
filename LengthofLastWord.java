class Solution {
    public int lengthOfLastWord(String s) 
    {
        

        int i =0;
        int count =0;
        for(i= s.length()-1 ; i>=0 ;i--)
        {
            if((count >0) && (s.charAt(i) ==' '))
            {
                return count;
            }
            else if((count == 0) && (s.charAt(i) ==' '))
            {
                continue;
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}