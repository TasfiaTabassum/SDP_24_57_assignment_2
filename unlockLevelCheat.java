// unlockLevelCheat Class implementing CheatCode Interface
public class unlockLevelCheat implements cheatCode {
    @Override
    public void activate() {
        System.out.println("Unlock the Level Cheat Activated!");
    }

    @Override
    public void deactivate() {
        System.out.println("Unlock the Level Cheat Deactivated!");
    }
}


