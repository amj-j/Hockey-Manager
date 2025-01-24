public class Goalie extends Player {
    private int wins;

    public Goalie(String name, int age, int wins) {
        super(name, age);
        this.wins = wins;
    }

    public Goalie(String name, int age) {
        super(name, age);
        this.wins = 0;
    }

    public int getWins() {
        return this.wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
