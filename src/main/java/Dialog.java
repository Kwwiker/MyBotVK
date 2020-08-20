import com.vk.api.sdk.objects.messages.Message;

public class Dialog extends Command {
    public Dialog(String name) {
        super(name);
    }

    @Override
    public void exec(Message message) {
        if (name.equals("Как")) {
            new VKManager().sendMessage("Всё хорошо, у тебя как?", message.getUserId());
        }
        if (name.equals("Плохо")) {
            new VKManager().sendMessage("Не грусти ", message.getUserId());
        }
        if (name.equals("Хорошо")) {
            new VKManager().sendMessage("Это замечательно!", message.getUserId());
        }
        if (name.equals("Отлично")) {
            new VKManager().sendMessage("Это хорошо)", message.getUserId());
        }
        if (name.equals("Такое")) {
            new VKManager().sendMessage("Почему? Что-то случилось?", message.getUserId());
        }
    }
}
