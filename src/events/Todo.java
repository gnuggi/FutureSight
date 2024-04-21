package events;

import java.time.LocalDateTime;

public class Todo implements Entry {
    private LocalDateTime deadline;
    private String location;
    private String description;
}
