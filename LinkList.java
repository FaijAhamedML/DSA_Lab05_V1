package linked_list;

public class LinkList {
    private Link first; // இதுதான் இன்ஜின்! சங்கிலியின் முதல் பெட்டியைக் குறிக்கும் [cite: 403]

    // Constructor
    public LinkList() {
        first = null;   // ஆரம்பத்தில் சங்கிலியில் பெட்டிகளே இல்லை, எனவே first காலியாக (null) உள்ளது [cite: 405]
    }

    public boolean isEmpty() {
        return (first == null); // first காலியாக இருந்தால், சங்கிலியில் ஒன்றுமே இல்லை என்று அர்த்தம் [cite: 408]
    }
    public void insertFirst(int id) {
        // படி 1: 50 என்ற எண்ணை வைத்து புதிய பெட்டியை உருவாக்கு [cite: 488]
        Link newLink = new Link(id);

        // படி 2: புதிய பெட்டியின் (50) 'next' இணைப்பை, பழைய முதல் பெட்டியுடன் (20) இணை [cite: 488]
        newLink.next = first;

        // படி 3: இப்போது சங்கிலியின் முதல் ஆள் (first) இந்த புதிய பெட்டி (50) தான் என மாற்று [cite: 489]
        this.first = newLink;
    }
    public Link deleteFirst() {
        // படி 1: முதல் பெட்டியை (50) தற்காலிகமாக 'temp' என்ற குறிப்பில் பத்திரப்படுத்து [cite: 498]
        Link temp = first;

        // படி 2: முதல் ஆள் (first) என்ற பதவியை இரண்டாவது பெட்டிக்கு (20) மாற்றிவிடு [cite: 498]
        first = first.next;

        // படி 3: நீக்கப்பட்ட பெட்டியை (50) திருப்பிக் கொடு [cite: 499]
        return temp;
    }


}
