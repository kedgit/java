 class Node {
    int data;
    Node left,right;

    public Node(int data){
        this.data=data;
        this.left=this.right=null;

    }
    
}
public class Tree {
    
        Node root;
        public Tree(){
            root=null;
        }
        void Inorder(Node node){
            if(node!=null){
                Inorder(node.left);
                System.out.print(node.data+" ");
                Inorder(node.right);
            }
        }
    
    public static void main(String[] args) {
        Tree b= new Tree();
        b.root=new Node(1);
        b.root.left=new Node(2);
        b.root.right=new Node(3);
        b.root.left.left=new Node(4);
        b.root.left.right=new Node(5);

        b.Inorder(b.root);


        
    }
    
}
