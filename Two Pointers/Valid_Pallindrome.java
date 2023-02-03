class Valid_Pallindrome {
    public boolean isPalindrome(String s) {
        String result = "";
        if(s.length()==1 || s.isEmpty())
            return true;
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                result = result+c;
            }
        }
        if(result.isEmpty()){
            return true;
        }
        result = result.toLowerCase();
        int i=0,j=result.length()-1;
        while(i<j){
            if(result.charAt(i)==result.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}