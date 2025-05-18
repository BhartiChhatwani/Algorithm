class Solution {
    public boolean isValid(String s) {

        Stack<Character> temp = new Stack();
        boolean result = false;

        if ( s == null || s.length() == 0) {
            return true;
        }

        for (int i =0 ; i < s.length(); i ++) {
            System.out.print("s.charAt(i)  " +s.charAt(i) );
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
               temp.push(s.charAt(i));    
            }

            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
               if(!temp.empty()) {
                char pop = temp.pop().charValue();   

                System.out.print("pop " +pop);
                if (s.charAt(i) == ')' && pop == '(' || 
                s.charAt(i) == ']' && pop == '['  ||
                s.charAt(i) == '}' && pop == '{' ) {
                result = true;
                }
                else {
               return false;
                }
               }
                else 
                return false;
            }            
        }
        if(!temp.empty()) {
            return false;
        } 
        else {
        return result;        
        }
    }
}
