package topics;

public class MyLinkedListRunner {

    private static MyLinkedList myLinkedList = new MyLinkedList();

    static {
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(8);
    }

    public static void main(String[] args) {

        myLinkedList.printLinkedList();
        System.out.println("*******");

        myLinkedList.deleteLast();
        myLinkedList.printLinkedList();
        System.out.println("*******");

        myLinkedList.deleteLast();
        myLinkedList.printLinkedList();
        System.out.println("*******");

        myLinkedList.deleteLast();
        myLinkedList.printLinkedList();
        System.out.println("*******");

        myLinkedList.deleteLast();
        myLinkedList.printLinkedList();
        System.out.println("*******");
    }
}
