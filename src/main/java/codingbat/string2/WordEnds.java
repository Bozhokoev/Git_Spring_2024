package codingbat.string2;

public class WordEnds {
    public static void main(String[] args) {
        WordEnds obj = new WordEnds();
        System.out.println(obj.wordEnds("abcXY123XYijk", "XY"));
    }
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < str.length()) {
            int start = str.indexOf(word, index);
            if (start == -1) {
                break;
            }
            if (start > 0) {
                result.append(str.charAt(start - 1));
            }
            if (start + word.length() < str.length()) {
                result.append(str.charAt(start + word.length()));
            }
            index = start + 1;
        }
        return result.toString();
    }
}
