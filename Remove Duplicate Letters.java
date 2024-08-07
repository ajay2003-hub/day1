import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26]; 
        boolean[] seen = new boolean[26]; 
        Stack<Character> stack = new Stack<>(); 

        
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            
            if (seen[ch - 'a']) {
                continue;
            }

            
            while (!stack.isEmpty() && stack.peek() > ch && lastOccurrence[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            
            stack.push(ch);
            seen[ch - 'a'] = true;
        }

        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
