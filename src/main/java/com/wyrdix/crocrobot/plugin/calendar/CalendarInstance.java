package com.wyrdix.crocrobot.plugin.calendar;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface CalendarInstance {
    File CALENDAR_FOLDER = new File("data/calendars");

    String id();

    void load();

    Map<String, CalendarElementTemplate> getTemplates();

    default CalendarElementTemplate getTemplate(String name) {
        return getTemplates().get(name);
    }

    List<CalendarElement> elements();
}
