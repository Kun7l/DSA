import java.util.ArrayList;
import java.util.Arrays;

public class YourOrderPlease {
    public String order(String words) {
        if(words.length() == 0){
            return "";
        }
        String ans = "";
        String[] wordArr = words.split(" ");
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
        String[] newList = new String[wordArr.length];

        for (String word : wordArr) {
            for (int i = 0; i < word.length(); i++) {
                if (list.contains(word.charAt(i))) {
                    newList[list.indexOf(word.charAt(i))] = word;
                    break;
                }
            }
        }

        for (int i = 0; i < newList.length; i++) {
            ans += newList[i] + " ";
        }
        
        return ans.trim();
    }

    public static void main(String[] args) {
        YourOrderPlease y = new YourOrderPlease();
        System.out.println(y.order("Krun7l lov4es hi3s mo1m an2d broth6er th5e mo8st"));
    }

}
