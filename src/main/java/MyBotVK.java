/*
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.api.sdk.callback.longpoll.CallbackApiLongPoll;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.apps.responses.GetResponse;


import java.io.IOException;
import java.util.Random;

public class MyBotVK {



    final static String key = "729f7732f0fdfc858303a4414299dc399fbbfc2f";
    final static String server = "https://lp.vk.com/wh198041673";
    final static String API_ID = "7572113";
    final static String CLIENT_SECRET = "JDCRtFQHl95n0w71704e";
    final static String REDIRECT_URI = "c914de18c914de18c914de185dc9675489cc914c914de189629e6ec8d0a1566d223ffc0";
    final static long ts = 3;
    private static final Random random = new Random();



    public static void main(String[] args) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Group group = new Group();

        TransportClient client = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(client);
        GroupActor actor = new GroupActor(group.groupId, group.TOKEN);

        try {
            vk.messages()
                    .send(actor)
                    .message("Я устал")
                    .userId(294302695)
                    .randomId(2)
                    .execute();
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }


        

        /*try {
            vk.messages().send(actor).message("Оно работает!").userId(294302695).randomId(random.nextInt()).execute();
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }*/

/*
    }
}

*/