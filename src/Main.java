public class Main {
    public static void main(String[] args) {
        String s = "i love programming very much";
        System.out.println("Words Reversed: " + reverseWords(s));
    }



    public static String reverseWords(String words)
    {

        StringBuilder reverse = new StringBuilder();
        int start = 0;

        for (int end = 0; end <= words.length() ; end++) {
            if( end == words.length() || words.charAt(end) == ' ')
            {
                for (int i = end - 1; i>= start ; i--) {
                    reverse.append(words.charAt(i));
                }
                if(end< words.length())
                {
                    reverse.append(' ');
                }
                start = end +1;
            }

        }

        return reverse.toString();
    }
}