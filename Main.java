public class Main {
    public static void main(String[] args) {
        player Player = new player("Alice");
        game Game = gameManager.createGame("Action");
        //game gameInstance = new game("Action", new actionGameLogic());
        
        Player.login();
        Player.joinGame(Game);
        userInterface.displayScore(Player);
        cloudAccountManager.updatePlayerStatus(Player);
    }
}