class Node {
    long prn;
    Node next;
    Node(long prn) { this.prn = prn; }
}

class PRNList {
    Node head;

    void addAtEnd(long prn) {
        Node newNode = new Node(prn);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        System.out.println("Admitted  : " + prn);
    }

    void delete(long prn) {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.prn == prn) {
            head = head.next;
            System.out.println("Cancelled : " + prn);
        } else {
            Node prev = head;
            while (prev.next != null && prev.next.prn != prn)
                prev = prev.next;
            if (prev.next == null) {
                System.out.println("PRN " + prn + " not found.");
            } else {
                prev.next = prev.next.next;
                System.out.println("Cancelled : " + prn);
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.prn + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Main {
    public static void main(String[] args) {
        PRNList list = new PRNList();
        long[] admitted = {2026001001L, 2026001002L, 2026001003L, 2026001004L};

        for (long prn : admitted)
            list.addAtEnd(prn);
        list.display();

        list.addAtEnd(2026001005L);
        list.display();

        list.delete(2026001003L);
        list.delete(2026001001L);
        list.delete(2026009999L);
        list.display();
    }
}
