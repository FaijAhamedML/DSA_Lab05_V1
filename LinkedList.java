package lab5.ex1;

import linked_list.Link;

public class LinkedList {
    private Link first; // இதுதான் இன்ஜின்! சங்கிலியின் முதல் பெட்டியைக் குறிக்கும் [cite: 403]

    // Constructor
    public LinkedList() {
        first = null;   // ஆரம்பத்தில் சங்கிலியில் பெட்டிகளே இல்லை, எனவே first காலியாக (null) உள்ளது [cite: 405]
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(int id,int Marks){
        Link newLink = new Link(id,Marks);
        newLink.next = first;
        this.first = newLink;
    }


}
