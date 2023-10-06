public class Main {
    public static void main(String[] args) {

        // Demo 1: Basic Gameplay and Player Interaction 

        player Player1 = new player("Tasfia");
        // Create an action game
        game ActionGame = gameManager.createGame("Action");

        // Player interaction
        Player1.signUp();
        Player1.login();
        Player1.joinGame(ActionGame);
        ActionGame.playGame();
        ActionGame.pauseGame();
        ActionGame.resumeGame();
        Player1.getScore();
        ActionGame.saveGameProgress();
        Player1.logout();

        // Display player score and cloud account operations
        userInterface.displayScore(Player1);
        cloudAccountManager.createPlayerStatus(Player1);
        cloudAccountManager.updatePlayerStatus(Player1);
        String playerStatus = cloudAccountManager.retrievePlayerStatus(Player1);
        System.out.println("Retrieved Player Status: " + playerStatus);



        // Demo 2: Cheat Code Activation and Deactivation

        // Create a player
        player Player2 = new player("Muntaher");
        // Create a strategy game
        game StrategyGame = gameManager.createGame("Strategy");

        // Player interaction
        Player2.signUp();
        Player2.login();
        Player2.joinGame(StrategyGame);
        StrategyGame.playGame();

        // Activate cheat codes
        StrategyGame.activateCheat("INFINITE_LIVES");
        StrategyGame.activateCheat("INFINITE_RESOURCES");
        StrategyGame.playGame(); // Player now has infinite lives and resources
        StrategyGame.deactivateCheat("INFINITE_RESOURCES");
        StrategyGame.playGame(); // Player still has infinite lives, but limited resources

        Player2.logout();


        // Demo 3: Player State Transitions

        // Create a player
        player Player3 = new player("Cake2");
        Player3.signUp();
        
        // Initial state: Offline
        Player3.login(); // Transition to Online state
        Player3.logout(); // Back to Offline state

        // Sign up and login
        
        Player3.login(); // Transition to Online state

        // Join a game
        game RacingGame = gameManager.createGame("Racing");
        Player3.joinGame(RacingGame);

        // Player status and cloud operations
        userInterface.displayScore(Player3);
        cloudAccountManager.updatePlayerStatus(Player3);
        cloudAccountManager.backupPlayerData(Player3);
        cloudAccountManager.retrievePlayerStatus(Player3);
        cloudAccountManager.deletePlayerData(Player3);
        cloudAccountManager.restorePlayerData(Player3);
        cloudAccountManager.permanentlyDeletePlayerData(Player3);


    }
}