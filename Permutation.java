import java.util.*;

public class Permutation {

    public static List<List<Integer>> permu(List<Integer> process, List<Integer> up) {
        List<List<Integer>> list = new ArrayList<>();

        if (up.isEmpty()) {
            list.add(new ArrayList<>(process));  // Add a copy of the process list to the list
            return list;
        }

        int ch = up.get(0);
        List<Integer> x = new ArrayList<>();
        x.add(ch);

        for (int i = 0; i <= process.size(); i++) {
            List<Integer> f = new ArrayList<>(process.subList(0, i));
            List<Integer> sec = new ArrayList<>(process.subList(i, process.size()));

            List<Integer> concatenatedList = new ArrayList<>();
            concatenatedList.addAll(f);
            concatenatedList.addAll(x);
            concatenatedList.addAll(sec);

            list.addAll(permu(concatenatedList, up.subList(1, up.size())));
        }

        return list;
    }

    public static void main(String[] args) {
        List<Integer> process = new ArrayList<>();
        List<Integer> up = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<List<Integer>> ans = permu(process, up);

        for (List<Integer> i : ans) {
            System.out.println(i);
        }
    }
}
