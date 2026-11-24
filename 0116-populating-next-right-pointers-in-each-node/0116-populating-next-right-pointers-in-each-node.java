class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node>queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            Node prev=null;
            for(int i=0;i<len;i++){
                Node cur=queue.poll();
                if(prev!=null){
                    prev.next=cur;
                }
                prev=cur;
                if(cur.left!=null)queue.offer(cur.left);
                if(cur.right!=null)queue.offer(cur.right);
            }
            prev.next=null;
        }
        return root;
    }
}