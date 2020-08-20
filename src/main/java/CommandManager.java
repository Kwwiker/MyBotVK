import java.util.HashSet;

public class CommandManager {

    private static HashSet<Command> commands = new HashSet<>();

    static {
        commands.add(new Unknown("unknown"));
        commands.add(new Weather("Погода"));
        commands.add(new Hello("Привет"));
        commands.add(new Level("lvl"));
        commands.add(new Level("up"));
        commands.add(new Dialog("Как"));
        commands.add(new Dialog("Плохо"));
        commands.add(new Dialog("Хорошо"));
        commands.add(new Dialog("Отлично"));
        commands.add(new Dialog("Такое"));
        commands.add(new Dialog("help"));
    }

    public static HashSet<Command> getCommands() {
        return commands;
    }

    public static void addCommand(Command command) {
        commands.add(command);
    }
}
