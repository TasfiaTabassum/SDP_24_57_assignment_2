public class gameManager {
    public static game createGame(String gameType) {
        switch (gameType) {
            case "Action":
                return new game(gameType, new actionGameLogic());
            case "Racing":
                return new game(gameType, new racingGameLogic());
            case "Strategy":
                return new game(gameType, new strategyGameLogic());
            default:
                throw new IllegalArgumentException("Invalid game type");
        }
    }
}


