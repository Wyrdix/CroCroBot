package com.wyrdix.crocrobot.plugin.calendar.impl;

import com.wyrdix.crocrobot.plugin.calendar.CalendarElement;
import com.wyrdix.crocrobot.plugin.calendar.CalendarElementTemplate;
import com.wyrdix.crocrobot.plugin.calendar.CalendarInstance;

public class CalendarElementImpl implements CalendarElement {
    private final CalendarInstance instance;
    private final int priority;
    private final int day;
    private final int beginning;
    private final int ending;
    private final String template;

    public CalendarElementImpl(CalendarInstance instance, int priority, int day, int beginning, int ending, String template) {
        this.instance = instance;
        this.priority = priority;
        this.day = day;
        this.beginning = beginning;
        this.ending = ending;
        this.template = template;
    }

    @Override
    public CalendarInstance instance() {
        return instance;
    }

    @Override
    public int priority() {
        return priority;
    }

    @Override
    public int day() {
        return day;
    }

    @Override
    public int beginning() {
        return beginning;
    }

    @Override
    public int ending() {
        return ending;
    }

    @Override
    public CalendarElementTemplate template() {
        return instance().getTemplate(template);
    }
}
