import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;

import java.util.HashMap;

public class VKDataBase {

    public static VKCore vkCore;
    static {
        try {
            vkCore = new VKCore();
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<Integer, Integer> infoDialog = new HashMap<>();

    public static void newDialog(int userId) {
        infoDialog.put(userId, 1);
    }

    public static void upLevel(int userId) {
        infoDialog.put(userId, infoDialog.get(userId) + 1);
    }

    public static int getLevel(int userId) {
        return infoDialog.get(userId);
    }

    public static boolean checkUser(int userId) {
        if (infoDialog.get(userId) == null) {
            return false;
        }
        return true;
    }
}
