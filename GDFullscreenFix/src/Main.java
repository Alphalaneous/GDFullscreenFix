import com.alphalaneous.SaveExplorer;
import com.alphalaneous.SaveValue;

import java.io.IOException;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String... args) throws IOException {

        SaveExplorer.loadSave();
        LinkedHashMap<String, Object> gameManager = SaveExplorer.getGameManager();

        if(!gameManager.containsValue("valueKeeper")){
            gameManager.put("valueKeeper", new LinkedHashMap<String, Object>());
        }

        LinkedHashMap<String, Object> valueKeeper = (LinkedHashMap<String, Object>) gameManager.get("valueKeeper");
        valueKeeper.put("gv_0025", new SaveValue('s', "1"));

        SaveExplorer.setDataFromKey(gameManager, "valueKeeper", valueKeeper);
        SaveExplorer.updateGameManager();

    }
}
