import java.util.HashMap;
import java.util.Map;

public class cheatCodeManager {
    private Map<String, cheatCode> cheat_Codes = new HashMap<>();

    public void addCheatCode(String name, cheatCode cheat_code) {
        cheat_Codes.put(name, cheat_code);
    }

    // activate a cheat code by name
    public void activateCheatCode(String name) {
        cheatCode cheatCode = cheat_Codes.get(name);
        if (cheatCode != null) {
            cheatCode.activate();
        } else {
            System.out.println("Cheat code not found: " + name);
        }
    }

    // deactivate a cheat code by name
    public void deactivateCheatCode(String name) {
        cheatCode cheatCode = cheat_Codes.get(name);
        if (cheatCode != null) {
            cheatCode.deactivate();
        } else {
            System.out.println("Cheat code not found: " + name);
        }
    }
}