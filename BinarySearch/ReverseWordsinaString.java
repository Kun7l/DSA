public class ReverseWordsinaString {
    public String reverseWords(String s) {
        s =s.trim().replaceAll("\\s{2,}"," ");
        String[] parts = s.split(" ");
        String newString = "";
        for (int i = parts.length-1; i>=0; i--) {
           newString = newString.concat(parts[i]+" ");
        }

        return newString.trim();
    }
}
