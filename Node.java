package mylinkedlist;

public class Node {
    public int data;
    public Node next;

    public Node(){

    }
    public Node(int data)
    {
        this.data  = data;
        this.next = null; // next mang kiểu dữ liệu Node  => cửa không đủ to để nhét next vào Node(thực tế là trỏ tới vị trí kế tiếp : mặc định là null)
    }

}

