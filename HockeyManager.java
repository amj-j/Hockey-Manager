import java.util.ArrayList;

public class HockeyManager {
    private ArrayList<Player> players = new ArrayList<>();

    public void addNewForward(Forward forward) {
        players.add(forward);
    }

    public void addNewDefender(Defender defender) {
        players.add(defender);
    }

    public void addNewGoalie(Goalie goalie) {
        players.add(goalie);
    }

    public void printNameAndAgeOfTheYoungestPlayer() {
        if (players.isEmpty()) {
            System.out.println("There are no players.");
        }

        Player youngestPlayer = players.get(0);
        for (Player player : players) {
            if (player.getAge() < youngestPlayer.getAge()) {
                youngestPlayer = player;
            }
        }
        System.out.println("Name: " + youngestPlayer.getName() + ", age: " + youngestPlayer.getAge());
    }
}