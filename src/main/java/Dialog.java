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
        if (name.equals("help")) {
            new VKManager().sendMessage("Список команд:\n" +
                    "1. help - бот покажет список команд\n" +
                    "2. Привет - бот отправит приветствие\n" +
                    "3. Как дела?/Как ты?/Как жизнь? - бот ответит на вопрос и спросит тебя\n" +
                    "3.1. Плохо - бот отреагирует\n" +
                    "3.2. Такое себе - бот отреагирует\n" +
                    "3.3. Хорошо - бот отреагирует\n" +
                    "3.4. Отлично - бот отреагирует\n" +
                    "4. lvl - бот отправит уровень\n" +
                    "5. up - бот поднимет уровень на 1\n" +
                    "6.1. Погода - бот выведет погоду в Ростове-на-Дону\n" +
                    "6.2. Погода <город> - бот выведет погоду в указанном городе", message.getUserId());
        }
    }
}
