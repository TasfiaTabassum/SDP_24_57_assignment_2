public class player {
    private String name;
    private playerState state;
    private int score;
    private boolean isTeamBased;

    public player(String name) {
        this.name = name;
        this.state = new offlineState();
        this.score = 0;
        this.isTeamBased = false; // set to false for demo. otherwise, this.isTeamBased = isTeamBased;
    }

    // Getter for isTeamBased property
    public boolean isTeamBased() {
        return isTeamBased;
    }

    public String getName() {
        return this.name;
    }

    public void setState(playerState state) {
        this.state = state;
    }

    public void updateStatus(String status) {
        System.out.println(name + "'s status updated to: " + status);
    }

    public void login() {
        state.login(this);
    }

    public void logout() {
        state.logout(this);
    }

    public void signUp() {
        System.out.println(name + " is signing up");
        System.out.println("Sign up complete!");
    }
    
    public void joinGame(game Game) {
        System.out.println(name + " has joined the " + Game.getGameType() + " game");
    }

    public void quitGame(game Game) {
        System.out.println(name + " is quiting the " + Game.getGameType() + " game");
    }


    public int getScore() {
        performanceMetrics metrics = new performanceMetrics(120,2,"single-player");
        metrics.setTimeTaken(120); // 2 minutes
        metrics.setLevelDifficulty(2); // moderate difficulty
        metrics.setMode("single-player");
        return calculateScore(metrics);
    }
    
    public int calculateScore(performanceMetrics metrics) {
        System.out.println("Score calculation for: " + name);

        int timeTaken = metrics.getTimeTaken();
        int levelDifficulty = metrics.getLevelDifficulty();
        String mode = metrics.getMode();

        if (isTeamBased) {
            score = calculateTeamBasedScore(timeTaken, levelDifficulty, mode);
        } else {
            score = calculateIndividualScore(timeTaken, levelDifficulty, mode);
        }
        return score;
    }


    private int calculateIndividualScore(int timeTaken, int levelDifficulty, String mode) {
        // here based on player's performance, time for completion, level, mode etc, the score is calculated.
        // the more time taken, the less final score will be.
        // the more difficult the level is, the greater the final score.
        System.out.println("Calculating score for: " + name + " based on individual performance...");
        return 1;
    }

    private int calculateTeamBasedScore(int timeTaken, int levelDifficulty, String mode) {
        // here based on team's performance, time for completion, level, mode etc, the score is calculated.
        // the more time taken, the less final score will be.
        // the more difficult the level is, the greater the final score.
        System.out.println("Calculating score for: " + name + " based on team performance...");
        return 10;
    }
    
}
