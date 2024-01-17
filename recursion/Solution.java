
import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean isPalindrome(String p) {
        if (p.length() == 1) {
            return true;
        }
        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(i) != p.charAt(p.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> partition1(String p, String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        if (isPalindrome(p)) {
            list1.add(p);
            list.add(new ArrayList<>(list1));
            return list;
        }

        if (s.length() == 1) {
            list1.add(s);
            list.add(new ArrayList<>(list1));
            return list;
        }

        int i = 0;
        while (i < s.length()) {
            char a = s.charAt(i);
            list1.add(String.valueOf(a));
            list.addAll(partition1(p + a, s.substring(i + 1)));
            list1.remove(list1.size() - 1);
            i++;
        }

        return list;
    }

    public List<List<String>> partition(String s) {
        return partition1("", s);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> result = solution.partition("aab");
        System.out.println(result);
    }
}
