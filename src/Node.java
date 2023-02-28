public class Node {
                                            // node creation
    Node Left ;
    Node Right ;
    int data;

    Node(int data)              // parameterized constructor to assign data
    {
        this.data=data;
        this.Left=null;
        this.Right=null;
    }

    public int getData() {                  //getter method
        return data;
    }
}
