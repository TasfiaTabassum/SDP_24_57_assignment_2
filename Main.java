public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        System.out.println("----------------------------------------------------------");

        System.out.println("Welcome! This is a demo of the Game Player System.");

        System.out.println("----------------------------------------------------------");
        System.out.println();
        // Demo 1: Basic Gameplay and Player Interaction 

        player Player1 = new player("Tasfia");
        // Create an action game
        game ActionGame = gameManager.createGame("Action");
        gameSettings settings = new gameSettings();

        // Player interaction
        Player1.signUp();
        System.out.println();
        Player1.login();
        System.out.println();
        Player1.joinGame(ActionGame);
        ActionGame.playGame();
        System.out.println();
        ActionGame.pauseGame();
        System.out.println();
        settings.displaySettings();
        System.out.println();
        ActionGame.resumeGame();
        System.out.println();
        Player1.getScore();
        System.out.println();
        ActionGame.saveGameProgress();
        Player1.logout();
        System.out.println();

        // Display player score and cloud account operations
        userInterface.displayScore(Player1);
        System.out.println();
        cloudAccountManager.createPlayerStatus(Player1);
        System.out.println();
        cloudAccountManager.updatePlayerStatus(Player1);
        System.out.println();
        String playerStatus = cloudAccountManager.retrievePlayerStatus(Player1);
        System.out.println();
        System.out.println("Retrieved Player Status: " + playerStatus);
        System.out.println();


        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();

        // Demo 2: Cheat Code Activation and Deactivation

        // Create a player
        player Player2 = new player("Muntaher");
        // Create a strategy game
        game StrategyGame = gameManager.createGame("Strategy");
        gameEvents events = new gameEvents();

        // Player interaction
        Player2.signUp();
        System.out.println();
        Player2.login();
        System.out.println();
        Player2.joinGame(StrategyGame);
        System.out.println();
        StrategyGame.playGame();

        // Activate cheat codes , event
        StrategyGame.activateCheat("INFINITE_LIVES");
        StrategyGame.activateCheat("INFINITE_RESOURCES");
        StrategyGame.playGame(); // Player now has infinite lives and resources
        StrategyGame.deactivateCheat("INFINITE_RESOURCES");
        StrategyGame.playGame(); // Player still has infinite lives, but limited resources
        System.out.println();
        StrategyGame.pauseGame();
        System.out.println();
        events.displayEvent();
        System.out.println();
        StrategyGame.resumeGame();
        System.out.println();
        Player2.logout();
        
        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println();
        // Demo 3: Player State Transitions

        // Create a player
        player Player3 = new player("Cake2");
        Player3.signUp();
        System.out.println();
        Player3.login();
        System.out.println();

        // Initial state: Offline
        Player3.login(); // Transition to Online state
        System.out.println();
        Player3.logout(); // Back to Offline state
        System.out.println();

        // Sign up and login
        
        Player3.login(); // Transition to Online state

        // Join a game
        game RacingGame = gameManager.createGame("Racing");
        System.out.println();
        Player3.joinGame(RacingGame);
        System.out.println();

        // Player status and cloud operations
        userInterface.displayScore(Player3);
        System.out.println();

        userInterface.displayDemoLeaderboard();

        cloudAccountManager.updatePlayerStatus(Player3);
        System.out.println();
        cloudAccountManager.backupPlayerData(Player3);
        System.out.println();
        cloudAccountManager.retrievePlayerStatus(Player3);
        System.out.println();
        cloudAccountManager.deletePlayerData(Player3);
        System.out.println();
        cloudAccountManager.restorePlayerData(Player3);
        System.out.println();
        cloudAccountManager.permanentlyDeletePlayerData(Player3);

        System.out.println();
        System.out.println("----------------------------------------------------------");


    }
}