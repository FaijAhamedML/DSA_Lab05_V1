package linked_list;

public class Link {
    public int iData;      // 1. தரவு (Data)
    public Link next;      // 2. அடுத்த பெட்டிக்கான இணைப்பு (Reference)

    // Constructor - புதிய பெட்டியை உருவாக்கும் போது நடப்பது
    public Link(int Data) {
        this.iData = Data;        // நாம் கொடுக்கும் எண்ணை பெட்டிக்குள் வைக்கும் [cite: 383]
        next = null;       // ஆரம்பத்தில் இது எதையும் இணைக்கவில்லை, எனவே null [cite: 384]
    }

    public void displayLink() { // பெட்டியில் உள்ளதைப் பார்க்க [cite: 388]
        System.out.println(iData);
    }
}
