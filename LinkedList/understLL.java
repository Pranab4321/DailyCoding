class understLL{
     class Node {
        int data; // integer type data variable
        Node next; //Reference variable of type Node
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head ;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

        System.out.println(head.next);
        System.out.println(head.data);
    }
    
    public static void main(String[] args){
        understLL list = new understLL();
        list.addFirst(100);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);

    }
}