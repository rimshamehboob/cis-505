import java.util.*;

/**
 * 9. Create a new file named TestSportsTeamApp with a main() method to test the Team class.
 * Prompt the user to enter the team and player names. For the player names, accept a string
 * of first names, separated by commas without spaces.
 * Use the inputted values to create a new instance of the Team class and use the player names to invoke the addPlayer method.
 * Display the results on two separate lines using the format “Number of players in team
 * <playerCount>” and “Players on team: <players>.” Allow the user to enter as many
 * teams and players as they choose by prompting them to decide between continuing or
 * exiting the program. Use a while loop in your programming logic.
 * Programming hints/how-to:
 */
public class TestSportsTeamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean doExitApp = false;

        while (!doExitApp) {
            System.out.print("Enter a team name: ");
            String teamName = scanner.nextLine();
            Team team = new Team(teamName);

            System.out.print("Enter the player names: (Separated by comma without space) ");
            String playerNames = scanner.nextLine();
            String[] playerNamesArray = playerNames.split(",");

            for (int i = 0; i < playerNamesArray.length; i++) {
                team.addPlayer(playerNamesArray[i]);
            }

            System.out.println("--- Team Summary ---");
            System.out.println("Numbers of players in the team: " + team.getPlayerCount());
            System.out.println("PLayers on team: " + playerNames);

            System.out.println("Continue ? (y/n)");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("N")) {
                doExitApp = true;
            }
        }
    }
}