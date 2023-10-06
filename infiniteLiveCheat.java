// InfiniteLivesCheat Class implementing CheatCode Interface
public class infiniteLiveCheat implements cheatCode {
    @Override
    public void activate() {
        System.out.println("Infinite Lives Cheat Activated!");
    }

    @Override
    public void deactivate() {
        System.out.println("Infinite Lives Cheat Deactivated!");
    }
}
