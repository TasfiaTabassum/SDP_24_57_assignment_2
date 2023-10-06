public class game implements playable {
    private String gameType;
    private gameLogic gameLogic;
    private cheatCodeManager CheatCodeManager;

    public game(String gameType, gameLogic gameLogic) {
        this.gameType = gameType;
        this.gameLogic = gameLogic;
        this.CheatCodeManager = new cheatCodeManager();
        CheatCodeManager.addCheatCode("INFINITE_LIVES", new infiniteLiveCheat());
        CheatCodeManager.addCheatCode("INFINITE_RESOURCES", new infiniteResourceCheat());
        CheatCodeManager.addCheatCode("UNLOCK_LEVELS", new unlockLevelCheat());
    }

    public String getGameType() {
        return gameType;
    }

    @Override
    public void playGame() {
        gameLogic.implementGameLogic();
    }

    @Override
    public void pauseGame() {
        System.out.println("Game paused.");
    }

    @Override
    public void resumeGame() {
        System.out.println("Game resumed.");
    }

    @Override
    public void saveGameProgress() {
        System.out.println("Game progress: saved.");
    }

    @Override
    public void loadGameProgress() {
        System.out.println("Game progress: loaded");
    }

    public void activateCheat(String cheatName) {
        CheatCodeManager.activateCheatCode(cheatName);
    }

    public void deactivateCheat(String cheatName) {
        CheatCodeManager.deactivateCheatCode(cheatName);
    }
}