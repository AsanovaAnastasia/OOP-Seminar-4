import impl.GbLinkedList;;

public class main {
    public static void main(String[] args) {

        GbLinkedList<Integer> list = new GbLinkedList<>();

        list.addAtBeginning(5);
        list.addAtTheEnd(7);
        System.out.println(list.getAllElems());

        list.addAtTheEnd(9);
        list.addAtBeginning(18);

        System.out.println(list.getAllElems());

        list.getSize();

       list.getElemByIndex(3);
    }
}
