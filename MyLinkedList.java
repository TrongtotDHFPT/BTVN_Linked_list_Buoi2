package mylinkedlist;

import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;

    public void Addfirst( int data)
    {
        Node newNode = new Node(data);
        newNode.next =head; // mới = đầu toa cũ 
        head = newNode;
    }
    public void AddLast(int data)
    {
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp= temp.next;
        }
        temp.next = newNode;
        // sau câu lệnh này => tìm đc node cuối cùng và gán cho temp
        // Nhiệm vụ cuối cùng : Last
        //temp.next = newwNode
    }
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(head == null){
            Addfirst(data);
            return;
        }else
        {
            Node temp = head;
            for (int i = 0; i < index  - 1; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode; 
        }
        
    }
    // BTVN: Viet code cho cac ham sau
    // 1. public int length()
    public int lengthLinkedList(){
        int count  = 1; 
        Node temp = head;
        while(temp.next != null)
        {
            count++;
            temp = temp.next;
        }
        return count;

    }
    
    // 2. public void display()
    public void displayLinkedList(){
        Node temp = head;
        if(temp.next == null)
        {
            System.out.println("Linked_list :"+temp);
        }
        while(temp.next!=null)
        {
            System.out.print(temp.getData()+"->");
            temp = temp.next;
            if(temp.next== null)
            {
                System.out.print(temp.getData());
            }
        }
    }
    // 3. public void deleteFirst()
    public void deleteFirst(){
        head = head.next;
    }
    public static void main(String[] args) {
    //    linkedList.addFirst(1);
    //    linkedList.addFirst(2);
    //    linkedList.addFirst(3);
        //3->2->1
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        //1->2->3
        linkedList.deleteFirst();
        linkedList.displayLinkedList();
        // System.out.println("Length of List :" +linkedList.lengthLinkedList());
    }
}
