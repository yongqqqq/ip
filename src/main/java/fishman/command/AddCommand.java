package fishman.command;

import fishman.task.TaskList;
import fishman.task.Task;
import fishman.utils.Ui;

/**
 * Represent the command to add a new task to the task list.
 * This command implements the Command interface and is for
 * adding a single task to the task list and displaying the confirmation message
 * that the task has been successfully added to the user and displaying the number of
 * task in the task list.
 */
public class AddCommand implements Command {

    /** The task to be added to the task list */
    private final Task task;

    /**
     * Constructs a AddCommand with the specified task.
     *
     * @param task The task object to be added to the task list.
     */
    public AddCommand(Task task) {
        this.task = task;
    }

    /**
     * @inheritDoc
     *
     * Adds the task to the task list and displays a confirmation message alongside the
     * current number of tasks in the list.
     *
     * @param tasks The TaskList which the new task will be added.
     */
    @Override
    public String execute(TaskList tasks, Ui ui) {
        tasks.addTask(task);
        return ui.getAddedTaskMessage(task, tasks.size());
    }
}
