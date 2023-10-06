// OfflineState Class implementing PlayerState Interface
public class offlineState implements playerState {
    @Override
    public void login(player Player) {
        System.out.println(Player.getName() + " is now online");
        Player.setState(new onlineState());
    }

    @Override
    public void logout(player Player) {
        System.out.println(Player.getName() + " is already offline");
    }
}