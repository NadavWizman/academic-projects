class Node {
    private int value;
    private Node next;
    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
    public int getValue(){ return value;}
    public Node getNext(){ return next;}
    public void show(){
        System.out.print(value+" ");
    }
    public void setNext(Node next){
        this.next = next;
    }
    public void showRec(){
        System.out.print(value+" ");
        if (next == null)
            return;
        next.showRec();
    }
 
}