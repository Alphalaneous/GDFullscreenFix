import com.alphalaneous.SaveExplorer;
import com.alphalaneous.SaveValue;

import java.io.IOException;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String... args) throws IOException {

        SaveExplorer.loadSave();
        LinkedHashMap<String, Object> gameManager = SaveExplorer.getGameManager();
        LinkedHashMap<String, Object> valueKeeper = (LinkedHashMap<String, Object>) SaveExplorer.getDataFromKey(gameManager, "valueKeeper");
        valueKeeper.put("gv_0025", new SaveValue('s', "1"));

        SaveExplorer.setDataFromKey(gameManager, "valueKeeper", valueKeeper);
        SaveExplorer.updateGameManager();
        
    }
}
