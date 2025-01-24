public class Defender extends Player {
    private int hits;

    public Defender(String name, int age, int hits) {
        super(name, age);
        this.hits = hits;
    }

    public Defender(String name, int age) {
        super(name, age);
        this.hits = 0;
    }
    
    public int getHits() {
        return this.hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}