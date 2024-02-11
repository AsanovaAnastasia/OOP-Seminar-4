package Interfaces;

import java.util.List;

public interface GBList<E> {
        void addAtBeginning(E elem);
        void addAtTheEnd(E elem);
        List<E> getAllElems();
        void getElemByIndex(int index);
        void getSize();
}
