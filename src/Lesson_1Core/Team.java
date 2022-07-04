package Lesson_1Core;

public class Team {
    private String name;
    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }
    public String getName() {
        return name;
    }
    public Team(String name, Player[]players){
        this.name = name;
        this.players = players;
    }

}
