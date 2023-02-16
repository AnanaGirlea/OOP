package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Stack implements Container {
    private ArrayList<Task> list = new ArrayList<Task>();


    @Override
    public Task pop() {
        if (!isEmpty()) {
            Task scos = list.get(size()-1);
            list.remove(size() - 1);
            return scos;
        }
        return null;
    }

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        if(size()>0){
            return false;
        }
        return true;
    }

    @Override
    public void transferFrom(Container container) {
        int i, n, k;
        n = container.size();
        for(i=n-1;i>=0;i--){
            push(container.pop());
        }
    }

    public ArrayList<Task> getTasks() {
        return list;
    }

    public void setTasks(ArrayList<Task> list) {
        this.list = list;
    }
}
