package lab8.task8;

import java.util.*;

public class Solution {
    public static int solver() {
        int n;
        List<Integer> v = new ArrayList<>();
        int i, j, nr;
        HashMap<Integer, Integer> map = new HashMap<>();
        n = new Scanner(System.in).nextInt();
        for (i = 0; i < n; i++) {
            v.add(new Scanner(System.in).nextInt());
        }
        for (i = 0; i < n; i++) {
            nr = 1;
            if(v.get(i) != 0) {
                for (j = i + 1; j < n ; j++) {
                    if (v.get(i) == v.get(j)) {
                        nr++;
                        v.set(j, 0);
                    }
                }
                map.put(v.get(i), nr);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int sol;
        sol = solver();
    }
}
