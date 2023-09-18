package com.wyrdix.crocrobot.command.calendar;

import com.wyrdix.crocrobot.command.KCommandImpl;
import com.wyrdix.crocrobot.plugin.CalendarPlugin;
import com.wyrdix.crocrobot.plugin.DefaultPlugin;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class CalendarCommand extends KCommandImpl {

    private static final CalendarCommand INSTANCE = new CalendarCommand();
    private static final String ID = "calendar";
    private static final String DESCRIPTION = "Renvoie votre emploie du temps de la semaine";

    public CalendarCommand() {
        super(DefaultPlugin.class, ID, DESCRIPTION);
    }

    public static CalendarCommand getInstance() {
        return INSTANCE;
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        CalendarPlugin.sendCalendar(event, CalendarPlugin.getCurrentWeek());
    }
}
