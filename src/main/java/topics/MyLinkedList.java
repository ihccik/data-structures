package topics;

import java.util.NoSuchElementException;

public class MyLinkedList {

    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Node first, last;
    public int size;

    public MyLinkedList(){
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty(){return first == null;}

    public void add(int item){
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;//kendi adresini, kendi eklenmeden önceki son elemana veriyor
            last = node;
        }
        size++;
    }

    public void deleteLast(){
        if(isEmpty())
            throw new NoSuchElementException();

        if (first == null)
            first = last = null;
        else {
            var previous = first;
            var current = first;
            while (current.next != null){//bu while da previous u buluyor, bunu last yapacak while dan sonra
                previous = current;
                current = current.next;
            }
            previous.next = null;
            last = previous;
            size--;
        }
    }

    public void printLinkedList(){
        if (isEmpty()) throw new NoSuchElementException();

        var current = first;

        while (current != null){
            System.out.println("value : " + current.value);
            current = current.next;
        }
    }
}
