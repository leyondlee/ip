package duke.task;

public class Event extends Task {
    private String at;

    public Event(String description, String at) {
        super(description, Task.TYPE_EVENT);
        this.at = at;
    }

    /**
     * Returns string in list entry format.
     * eg. [T][ ] task1 (at: Aug 6th 2-4pm)
     *
     * @return The formatted string.
     */
    @Override
    public String toString() {
        return String.format("%s (at: %s)", super.toString(), at);
    }

    @Override
    public String toFileString() {
        return String.format("%c | %d | %s | %s", taskType, (isDone) ? 1 : 0, description, at);
    }
}
