package impl;

import Interfaces.GBList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GbLinkedList<E> implements GBList<E> {

  private static class MyList<E> {

    E elem;
    MyList<E> previous;
    MyList<E> next;

    MyList(E elem) {
      this.elem = elem;
      this.previous = previous;
      this.next = next;
    }
  }

  private int size;
  private MyList<E> firstElem;
  private MyList<E> lastElem;

  public GbLinkedList() {
    this.size = 0;
    this.firstElem = null;
    this.lastElem = null;
  }

  @Override
  public void addAtBeginning(E elem) {
    MyList<E> newElem = new MyList<>(elem);
    if (firstElem == null) {
      firstElem = newElem;
      lastElem = newElem;
    } else {
      newElem.next = firstElem;
      firstElem.previous = newElem;
      firstElem = newElem;
    }
    size++;
  }

  @Override
  public void addAtTheEnd(E elem) {
    MyList<E> newElem = new MyList<>(elem);
    if (lastElem == null) {
      firstElem = newElem;
      lastElem = newElem;
    } else {
      newElem.previous = lastElem;
      lastElem.next = newElem;
      lastElem = newElem;
    }
    size++;
  }

  @Override
  public List<E> getAllElems() {
    List<E> elems = new ArrayList<>();
    MyList<E> current = firstElem;
    while (current != null) {
      elems.add(current.elem);
      current = current.next;
    }
    return elems;
  }

  @Override
  public void getElemByIndex(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Элемента под таким индексом нет");
    }
    MyList<E> current = firstElem;
    for (int i = 0; i < index; i++) {
      current = current.next;
    }
    System.out.println(current.elem + " - элемент под выбранным индексом");
  }

  @Override
  public void getSize() {
    System.out.println("Количество всех элементов = " + size);
  }
}
