package LinkedList;

import pattern.solidRhombus;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }
    public void addAt(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0; 
        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next ;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i = 0; i < size - 2; i++){
            prev = prev.next;
        }

        int val = tail.data;// prev.next.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int Search(int key){
        Node temp = head;
        int i = 0; 
        while(temp != null)
        {
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }
    public int helper(Node head, int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;

        }
        if(n == sz){
            head = head.next;//removeFirst
            return; 
        }

        //sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public void print(){
        if (head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(12);
        ll.addLast(0);
        ll.print(); 

        System.out.println(ll.size);
        ll.deleteNthfromEnd(3);
        ll.print();
    }
    
}
