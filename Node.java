 class Node {
     String data;
     Node next;

   
    }

class LinkedList{
    Node head;

    public void insert(String data){
        Node node = new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;

            }
            n.next=node;
        }
    }
    public void print(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        } 
        System.out.println(n.data);


    }
    
}

        
   
