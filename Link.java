package lab5.ex1;

public class Link {
    public int id;
    public double marks;
    public Link next;

    public Link(int id, double marks) {
        this.id = id;
        this.marks = marks;
        this.next = null;
    }

    public void displayLink() {
        System.out.println("ID: " + id + ", Marks: " + marks);
    }

}
