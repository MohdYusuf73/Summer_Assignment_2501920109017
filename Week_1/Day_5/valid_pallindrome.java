class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String lower = s.toLowerCase();
        char c1, c2;
        while(i<=j)
        {
            c1= lower.charAt(i);
            c2= lower.charAt(j);
            if(((c1>='a' && c1<='z')||(c1>='0'&&c1<='9'))&&((c2>='a' && c2<='z')||(c2>='0'&&c2<='9')))
            {
                if(c1==c2)
                {
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
            else if( (c1<'a' || c2>'z') && ((lower.charAt(j)>='a' && lower.charAt(j)<='z') || (c2>='0'&&c2<='9') ))
            {
                i++;
            }
            else if( ((c1>='a' && c1<='z') || (c1>='0'&&c1<='9')) && (lower.charAt(j)<'a' || lower.charAt(j)>'z'))
            {
                j--;
            }
            else{
                i++;
                j--;
            }
          
        }
        if(i>j)
        {
            return true;
        }
        return false;
    }
}