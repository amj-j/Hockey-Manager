public class Forward extends Player {
    private int goals;

    public Forward(String name, int age, int goals) {
        super(name, age);
        this.goals = goals;
    }

    public Forward(String name, int age) {
        super(name, age);
        this.goals = 0;
    }
    
    public int getGoals() {
        return this.goals;
    }

    public void setGoals(int goalsNum) {
        this.goals = goalsNum;
    }
}
