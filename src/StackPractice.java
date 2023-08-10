import java.util.Stack;
import java.util.Arrays;

public class StackPractice {
    //Reverse String
    public void reverseString() {
        String str = "abcd";
        char[] charArray = str.toCharArray();

        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < charArray.length; i++) {
            charStack.push(charArray[i]);
        }

        while (!charStack.empty()) {
            System.out.print(charStack.pop());
        }
    }

    public boolean isBalanced(String input){
        Stack<Character> s = new Stack<>();
        for(char ch: input.toCharArray() ){
            switch(ch)
            {
                case '(': s.push(ch);
                break;
                case '[': s.push(ch);
                break;
                case '<': s.push(ch);
                break;
                case ')': if(s.peek() == '(') s.pop();
                break;
                case ']': if(s.peek() == '[') s.pop();
                break;
                case '>': if(s.peek() == '<') s.pop();
                break;
            }
            System.out.println(s);
        }
        if(s.empty()) return true;
        else return false;
    }
}
