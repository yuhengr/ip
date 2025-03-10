package ui;

/**
 * This UI class contains the messages to be displayed.
 */
public class UI {

    private static String LOGO = " ____        _        \n"
            + "|  _ \\ _   _| | _____ \n"
            + "| | | | | | | |/ / _ \\\n"
            + "| |_| | |_| |   <  __/\n"
            + "|____/ \\__,_|_|\\_\\___|\n";

    public static String GREETING_MESSAGE = "I'm Ekud! What can I do for you?";

    public static String FILE_NOT_FOUND_MESSAGE = "File is not found. Tasks cannot be loaded.";

    public static String INVALID_COMMAND_MESSAGE = "That's not a valid command.";

    public static String FILE_WRITE_ERROR_MESSAGE = "Something went wrong when saving the tasks.";

    public static String TASK_ADDED_MESSAGE = "Got it. I've added this task:";

    public static String TODO_FORMAT_ERROR_MESSAGE = "Invalid Todo format.";

    public static String DEADLINE_FORMAT_ERROR_MESSAGE = "Invalid Deadline format.";

    public static String DEADLINE_ERROR_MESSAGE = "Error. Unable to add Deadline.";

    public static String EVENT_FORMAT_ERROR_MESSAGE = "Invalid Event format.";

    public static String EVENT_ERROR_MESSAGE = "Error. Unable to add Event.";

    public static String INVALID_TASK_NUM_MESSAGE = "The task number is not valid or not provided.";

    public static String UNMARK_TASK_MESSAGE = "OK, I've marked this task as not done yet:";

    public static String MARK_TASK_MESSAGE = "Nice! I've marked this task as done:";

    public static String DELETE_TASK_MESSAGE = "Noted. I've removed this task:";

    public static String LIST_TASK_MESSAGE = "Here are the tasks in your list:";

    public static String FIND_ERROR_MESSAGE = "Error searching for relevant tasks.";

    public static String FIND_RESULT_MESSAGE = "Here are the matching tasks in your list:";

    public static String EXIT_MESSAGE = "Goodbye. Hope to see you again soon.";

    public static void showTaskCountMessage(int taskCount) {
        System.out.println("Now you have " + taskCount + " tasks in the list.");
    }
}
