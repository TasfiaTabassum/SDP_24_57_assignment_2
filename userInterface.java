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
    System.out.println("Displaying leaderboard: ");
}
    public static void displayDemoLeaderboard() {
        // for demo purposes, we will just display a hardcoded leaderboard
    System.out.println("------------------------------------------");
    System.out.println("|   Displaying leaderboard (Top 3):        |");
    System.out.println("|           1.Muntaher: 100                |");
    System.out.println("|           2.Tasfia: 55                   |");
    System.out.println("|           3.Cake2: 35                    |");
    System.out.println("------------------------------------------");
}


    public static void displayGameMenu() {
        System.out.println("Displaying game menu");
    }
}