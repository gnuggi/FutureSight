package events;

import java.time.LocalDateTime;

public class Event implements Entry {

    private String name;
    private LocalDateTime time;
    private String location;
    private String description;

    public Event(String name, LocalDateTime time, String location, String description) {
    }

    public String getName() {return name;}
    public LocalDateTime getTime() {return time;}
    public String getLocation() {return location;}
    public String getDescription() { return description; }
}
