public class LinkedList implements List {

    public Node head;
    public int size;

    public LinkedList() {
		this.head = null;
        this.size = 0;

    }

    public void add(Object obj) {

        add(0, obj);

    }
    
    public void add(int index, Object obj)
	{
		Node tempNode = head;
        Node node;
        
		for(int i=0; i < index-1 && tempNode.next != null; i++) {

            tempNode = tempNode.next;
            
        }
        
		node = tempNode.next;
		tempNode.next = new Node(obj);
		tempNode.next.next = node;
		size++;
    }

    public Node get(int index)
	{
        Node node = head;
        
		for(int i=0; i<index; i++) {

            node = node.next;
            
        }
        
        return node;
        
    }
    
    public void remove(int index) throws Exception 
	{
        Node node = head;

        if (!node.next) {
        	throw Exception("Oh No");
        }
        
		for(int i=0; i< index - 1 && node.next != null; i++) {

            node = node.next;
            
        }
        
        node.next = node.next.next;
        size--;
        
    }
    
    public int size(){
        return size;
    }

}