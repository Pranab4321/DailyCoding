class LLL{
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("The node is empty.");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty.");
            return; 
        }
        
        head = head.next;

    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        Node secLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secLast = secLast.next;
            lastNode = lastNode.next;
        }

        secLast.next = null;
    }

    public static void main(String[] args){
        LLL list = new LLL();
        list.addFirst("apple");
        list.addFirst("Mango");
        list.printList();

        list.addLast("banana");
        list.addLast("papaya");
        list.printList();

        list.addLast("potato");
        list.addFirst("carrot");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();

    }
}