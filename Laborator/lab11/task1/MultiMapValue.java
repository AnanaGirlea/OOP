package lab11.task1;

import java.util.*;

public class MultiMapValue<K, V> {

    public HashMap<K, ArrayList<V>> hashMap = new HashMap<>();

    public MultiMapValue(HashMap<K, ArrayList<V>> hashMap) {
        this.hashMap = hashMap;
    }

    public MultiMapValue(){}

    public void add(K key, V value) {
        // TODO - DONE
        if( hashMap.get(key) != null){
            ArrayList<V> list = hashMap.get(key);
            list.add(value);
            hashMap.put(key, list);
        } else{
            ArrayList<V> list = new ArrayList<>();
            list.add(value);
            hashMap.put(key, list);
        }
    }

    public void addAll(K key, List<V> values) {
        // TODO - DONE
        for(K i : hashMap.keySet()){
            if (i.equals(key)){
                hashMap.get(i).addAll(values);
            }
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        // TODO
        for (K i : map.hashMap.keySet()) {
            if(hashMap.get(i) != null) {
                hashMap.get(i).addAll(map.hashMap.get(i));
            } else {
                ArrayList<V> list = new ArrayList<>();
                list.addAll(map.hashMap.get(i));
                hashMap.put(i, list);
            }
        }
    }

    public V getFirst(K key) {
        // TODO - DONE
        for(K i : hashMap.keySet()) {
            if(i.equals(key)) {
                return hashMap.get(i).get(0);
            }
        }
        return null;
    }

    public List<V> getValues(K key) {
        // TODO - DONE
        List<V> list = new ArrayList<>();
        for(K i : hashMap.keySet()) {
            if(i.equals(key)) {
                list.addAll(hashMap.get(i));
//                for (int j = 0; j < hashMap.size(); j++)
//                 list.add(hashMap.get(i).get(j));
            }
        }
        return list;
    }

    public boolean containsKey(K key) {
        // TODO - DONE
        for(K i : hashMap.keySet()) {
            if(i.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        // TODO - DONE
        if(hashMap.isEmpty()){
            return true;
        }
        return false;
    }

    public List<V> remove(K key) {
        // TODO - DONE
        List<V> list = new ArrayList<>();
        for(K i : hashMap.keySet()) {
            if(i.equals(key)) {
                list.addAll(hashMap.get(i));
                hashMap.remove(i);
                return list;
            }
        }
        return null;
    }

    public int size() {
        // TODO - DONE
        return hashMap.size();
    }
}
