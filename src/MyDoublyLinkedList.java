import java.util.Objects;

public class MyDoublyLinkedList<T>{

   private Node head;
   private Node last;
   private int size = 0;

   private class Node {

    T value;
    Node next;
    Node prev;

       public Node(T value, Node next, Node prev) {
           this.value = value;
           this.next = next;
           this.prev = prev;
       }

       public Node(T value) {
           this.value = value;
       }
   }

   public void add(T element){
      if(Objects.isNull(head)){
          head = new Node(element);
          last = head;
          size++;
      }

     last.next = new Node(element);
     last.next.prev = last;
     last = last.next;
     size++;
   }



   public T contains(T element){
      Node temp = head;
      while(temp.next != null){
         if(temp.value.equals(element)){
            return temp.value;
         }
      }
      return null;
   }

    public void remove(int ind){
        if (ind == 0){
            head = head.next;
            size--;
            return;
        }

        if (ind == size - 1){
            last.prev.next = null;
            size--;
            return;
        }
        int num = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (num == ind){
                x.prev.next = x.next;
                return;
            }
            num--;
        }
    }


    public T get(int ind){
        int num = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (num == ind){
                return x.value;
            }
            num--;
        }
        return null;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(Node x = head; x != null; x = x.next){
            result.append(x.value).append(",");
        }
        return result.substring(0, result.length() - 1) + "]";
    }

}


