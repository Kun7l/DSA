import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationOfaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }
        HashMap<Character, List<Character>> map = new HashMap<>();
        map.put('2', new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put('3', new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put('4', new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put('5', new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put('6', new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put('7', new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put('8', new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put('9', new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
        List<String> finalAns = new ArrayList<>();
        findAll(digits, map, finalAns, "", 0);
        return finalAns;
    }

    public void findAll(String digits, HashMap<Character, List<Character>> map, List<String> finalAns, String sol,
            int digitIndex) {
        if ( digitIndex == digits.length()) {
            if (sol.length() == digits.length()) {
                finalAns.add(sol);
            }
            return;
        }
        List<Character> insideList = map.get(digits.charAt(digitIndex));
        for (int i = 0; i < insideList.size(); i++) {
            sol += insideList.get(i);
            findAll(digits, map, finalAns, sol, digitIndex+1);
            sol = sol.substring(0, sol.length() - 1);
        }
    }
    public String convertToBinary(int num){
        String res = "";
        while (num!= 1) {
            if(num%2==1) res+="1";
            else res+= "0";
            num/=2;
        }
        return res+"1";
    }

    public static void main(String[] args) {
        String digits = "72";
        LetterCombinationOfaPhoneNumber l = new LetterCombinationOfaPhoneNumber();
        System.out.println(l.convertToBinary(3));
    }
}
