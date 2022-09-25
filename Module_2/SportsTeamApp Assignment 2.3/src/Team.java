import java.util.*;

/**
 * (The Team class). Design a class named Team to represent a sports team. The class contains:
 * 1. A private string data field named teamName that specifies the teams name. The default is an empty string.
 * 2. A private string array data field named players that specifies the players assigned to a team. The default size is 20.
 * 3. A private int data field named playerCount that specifies the number of players on a team.The default is 0.
 * 4. An argument constructor that creates a team using the teamName data field as an argument.
 * 5. A public method named addPlayer with a string argument that adds a player to the players data field. This method should increment the playerCount data field, so you are able to use the array’s index to add new players.
 * 6. A public string array method named getPlayers that returns the players data field.
 * 7. A public int method named getPlayerCount that returns the playerCount data field.
 * 8. A public string method named getTeamName that returns the teamName data field.
 */
public class Team {
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount;

    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;

    }

    public int getPlayerCount() {
        return playerCount;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                '}';
    }
}