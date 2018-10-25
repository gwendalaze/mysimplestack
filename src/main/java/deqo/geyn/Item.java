package deqo.geyn;

public class Item {

    private int value;

    public Item(int value){
        this.value = value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
