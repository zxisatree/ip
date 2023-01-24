public class Event extends Task {
    private String startDate;
    private String endDate;
    public Event(String description, String startDate, String endDate) {
        super(description);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toEncodedString() {
        return "[" + TaskType.E + "]" + super.toString() + " /from: " + this.startDate + " /to: " + this.endDate;
    }

    @Override
    public String toString() {
        return "[" + TaskType.E + "]" + super.toString() + " (from: " + this.startDate + " to: " + this.endDate + ")";
    }
}
