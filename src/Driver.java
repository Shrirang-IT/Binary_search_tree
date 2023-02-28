import java.util.Scanner;

public class Driver {

    Node root;
    Node runner;

    int varData;

    Driver ()
    {
        root=null;
        runner=null;
    }

    Node treeCreate(Node temp,Node root) {                       // tree creation with recursion

        if (root == null)
            return temp;

        else if (temp.getData() >= root.getData()) {
            root.Right = treeCreate(temp, root.Right);
            return root;
        } else {
            root.Left = treeCreate(temp, root.Left);
            return root;

        }
    }

    void Display_all(int choice){
        runner=root;
        switch (choice){
            case 2 -> inOrder(runner);
            case 3 -> preOrder(runner);
            case 4 -> postOrder(runner);
        }
    }
   public void getdata(){                  //function to get data
        System.out.print("Enter Data : " );
        Scanner sc=new Scanner(System.in);
        varData=sc.nextInt();
    }

   public void create(){
        Node temp=new Node(varData);
        runner=treeCreate(temp,runner);
        root=runner;

    }

   public void inOrder(Node runner) {                        // inorder tree traversal

        if (runner != null) {
            inOrder(runner.Left);
            System.out.println(runner.getData());
            inOrder(runner.Right);
        }
    }
    public void preOrder(Node runner) {                    //pre-order tree traversal

        if (runner != null) {
            System.out.println(runner.getData());
            preOrder(runner.Left);
            preOrder(runner.Right);
        }
    }
    public void postOrder(Node runner) {           //post-order tree traversal

        if (runner != null) {
            postOrder(runner.Left);
            postOrder(runner.Right);
            System.out.println(runner.getData());
        }
    }
}
