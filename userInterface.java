import java.util.List;

public class userInterface {
    public static void displayLogin() {
        System.out.println("Displaying login UI Interface.");
    }

    public static void displaySignUp() {
        System.out.println("Displaying sign-up UI Interface.");
    }

    public static void displayScore(player Player) {
        System.out.println("Displaying score for " + Player.getName() + ": " + Player.getScore());
    }

    public static void displayLeaderboard(List<player> players) {
    System.out.println("Displaying leaderboard");
}


    public static void displayGameMenu() {
        System.out.println("Displaying game menu");
    }
}