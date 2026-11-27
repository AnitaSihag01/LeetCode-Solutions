class MyLinkedList {
    class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
    Node head ;
    Node tail ;
    public MyLinkedList() {
        this.head = null; 
        this.tail = null ;
    }
    
   public int get(int index) {
        if (index < 0) return -1;

        Node temp = head;
        int cnt = 0;

        while (temp != null) {
            if (cnt == index) {
                return temp.data;
            }

            cnt++;
            temp = temp.next;
        }

        return -1;
    }
    
    public void addAtHead(int val) {
        Node temp = new Node(val, head , null) ; 
        if( head == null) {
            head = temp ;
            tail = temp ;
        }
        else{
            head.prev = temp ;
            head = temp ;
        }
    }
    
    public void addAtTail(int val) {
       Node temp = new Node(val, null, tail);
        if (head == null) {
             head = temp;
            tail = temp;
        } else {
                tail.next = temp;
                tail = temp;
        }
    }
    
    public void addAtIndex(int index, int val) {
       if (index < 0) return;
        if( index == 0 ){
             addAtHead(val);
             return ;
         }
        int cnt = 0 ;
       Node temp = head;
        while (temp != null) {

            if (cnt == index - 1) {

                if (temp == tail) {
                    addAtTail(val);
                    return;
                }

                Node x = new Node(val, temp.next, temp);

                temp.next.prev = x;
                temp.next = x;

                return;
            }

            cnt++;
            temp = temp.next;
        }

    }
    
        public void deleteAtIndex(int index) {
        if (head == null || index < 0) return;

        int cnt = 0;
        Node temp = head;

        while (temp != null) {
            if (cnt == index) {
                break;
            }
            cnt++;
            temp = temp.next;
        }

        if (temp == null) return;

        Node back = temp.prev;
        Node front = temp.next;

        if (back == null) {
            head = front;
        } else {
            back.next = front;
        }

        if (front == null) {
            tail = back;
        } else {
            front.prev = back;
        }

        temp.next = null;
        temp.prev = null;
    }
}    
           

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
