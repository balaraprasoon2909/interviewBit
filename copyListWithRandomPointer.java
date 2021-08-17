class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node node = head;
        while(node != null){
            map.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        while(node != null){
            Node clone = map.get(node);
            clone.next = map.get(node.next);
            clone.random = map.get(node.random);
            node = node.next;
        }
        return map.get(head);
    }
}
