// OnlineState Class implementing PlayerState Interface
public class onlineState implements playerState {
    @Override
    public void login(player Player) {
        System.out.println(Player.getName() + " is already online");
    }

    @Override
    public void logout(player Player) {
        System.out.println(Player.getName() + " is now offline");
        Player.setState(new offlineState());
    }
}