package tugas3;

public class Node {
        int nomor;
        String nama;
        Node prev, next;
    
        public Node(Node prev, int nomor, String nama, Node next) {
            this.prev = prev;
            this.nomor = nomor;
            this.nama = nama;
            this.next = next;
    
        }

}
