package lab8.task7;

import java.util.LinkedHashSet;

public class LinkedSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer integer) {
        if(integer % 2 == 0)
            return super.add(integer);
        return false;
    }
}
