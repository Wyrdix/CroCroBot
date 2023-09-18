package com.wyrdix.crocrobot.plugin;

import com.google.gson.reflect.TypeToken;
import com.wyrdix.crocrobot.GlobalConfig;
import com.wyrdix.crocrobot.CroCroBot;
import com.wyrdix.crocrobot.command.KCommand;
import net.dv8tion.jda.api.JDA;

import java.lang.reflect.Type;

public interface Plugin {
    void onEnable();

    void save();

    default boolean isEnable() {
        return GlobalConfig.getGlobalConfig().getConfig(getClass()).isEnabled();
    }

    default void addCommand(KCommand command) {

    }

    default JDA getJda() {
        return CroCroBot.getJDA();
    }

    default PluginInfo getInfo() {
        PluginInfo info = getClass().getAnnotation(PluginInfo.class);
        if (info == null) throw new RuntimeException("Plugin class should be annotated with @PluginInfo");
        return info;
    }

    class PluginConfig {
        public static final Type PLUGIN_CONFIG_TYPE = new TypeToken<PluginConfig>() {
        }.getType();
        boolean enabled = true;

        public PluginConfig() {
        }

        public PluginConfig(PluginConfig config) {
            this.enabled = config.enabled;
        }

        public boolean isEnabled() {
            return enabled;
        }
    }
}
