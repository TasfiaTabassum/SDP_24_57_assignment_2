public class performanceMetrics {
    private int timeTaken; // in seconds
    private int levelDifficulty; // difficulty level (e.g., easy, medium, hard)
    private String mode;

    public performanceMetrics(int timeTaken, int levelDifficulty, String mode) {
        this.timeTaken = timeTaken;
        this.levelDifficulty = levelDifficulty;
        this.mode = mode;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public int getLevelDifficulty() {
        return levelDifficulty;
    }

    public String getMode() {
        return mode;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    public void setLevelDifficulty(int levelDifficulty) {
        this.levelDifficulty = levelDifficulty;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    
}
