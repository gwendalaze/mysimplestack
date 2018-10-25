package deqo.geyn;

import java.util.List;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class MySimpleStack implements SimpleStack {

    List<Item> items;

    public MySimpleStack(){
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public int getSize() {
        return this.items.size();
    }

    @Override
    public void push(Item item) {
        this.items.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (this.getSize() == 0){
            throw(new EmptyStackException());
        }
        return this.items.get(this.getLastIndex());
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (this.getSize() == 0){
            throw(new EmptyStackException());
        }
        Item r = this.items.get(this.getLastIndex());
        this.items.remove(this.getLastIndex());
        return r;
    }

    public Item popDown() throws EmptyStackException {
        if (this.getSize() == 0){
            throw(new EmptyStackException());
        }
        Item r = this.items.get(0);
        this.items.remove(0);
        return r;
    }

    private int getLastIndex(){
        return this.getSize()-1;
    }
}
