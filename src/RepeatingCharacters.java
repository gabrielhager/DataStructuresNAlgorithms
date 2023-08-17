import java.util.HashSet;

public class RepeatingCharacters {
    char firstNonRepeat;
    char[] sentence;
    int pos = 0;
    boolean isRepeating = true;

    public RepeatingCharacters(String input){
        sentence = input.toCharArray();
        firstNonRepeat = sentence[pos];
    }

    public char firstNonRepeatingChar(){
        boolean didChange;
        while(isRepeating){
            didChange = false;
            for(int i = 0; i < sentence.length; i++){
                if((sentence[i] == firstNonRepeat) && (i != pos))
                {
                    firstNonRepeat = sentence[++pos];
                    didChange = true;
                    break;
                }
            }
            if(!didChange)
            {
                isRepeating = false;
            }
        }

        return firstNonRepeat;
    }

    public char getFirstRepeated(){
        HashSet<Character> charSet = new HashSet<>();

        for(char ch : sentence){
            if(charSet.contains(ch))
                return ch;
            else
                charSet.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
