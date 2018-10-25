package deqo.geyn;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class MySimpleStackTest {

    MySimpleStack stack;
    Item testItem;

    @Before
    public void setUp(){
        stack = new MySimpleStack();
        testItem = new Item(5);
    }

    @Test
    public void isEmptyAtCreate() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyAfterPop(){
        stack.push(testItem);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void getSizeAfterCreate() {
        assertEquals(stack.getSize(),0);
    }

    @Test
    public void getSizeAfterPush(){
        stack.push(testItem);
        assertEquals(stack.getSize(),1);
    }

    @Test
    public void peek() {
        stack.push(testItem);
        assertEquals(stack.peek().getValue(),5);
    }

    @Test
    public void pop() {
        stack.push(testItem);
        int val = stack.peek().getValue();
        assertEquals(stack.pop().getValue(),val);
    }

    @Test (expected = EmptyStackException.class)
    public void popEmpty(){
        stack.pop();
    }

    @Test (expected = EmptyStackException.class)
    public void peekEmpty(){
        stack.peek();
    }
}