public class MyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        // Sau câu lenh nay, anh da tim duoc node cuoi cung, va duoc gan cho
        // temp
        // Nhiem vu cuôi cung: Naruto: The Last => Boruto: Naruto Next Generation
        temp.next = newNode;

    }
// 0
    public void add(int data, int index){
        Node newNode = new Node(data);
        if(index == 0){
            addFirst(data);
            return;
        } else{
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
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
        MyLinkedList linkedList = new MyLinkedList();
    //    linkedList.addFirst(1);
    //    linkedList.addFirst(2);
    //    linkedList.addFirst(3);
        //3->2->1//
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        //1->2->3
        System.out.print("Before delete :");
        linkedList.displayLinkedList();
        linkedList.deleteFirst();
        System.out.println();
        System.out.print("After delete First Node:");
        linkedList.displayLinkedList();
        System.out.println();
        System.out.println("Length of List :" +linkedList.lengthLinkedList());
    }

}
