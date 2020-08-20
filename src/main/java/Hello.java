import com.vk.api.sdk.objects.messages.Message;

public class Hello extends Command {

    public Hello(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendMessage("Привет, "
                + VKManager.getUserInfo(message.getUserId()).getFirstName(), message.getUserId(), "photo-198041673_457239018");
    }
}
