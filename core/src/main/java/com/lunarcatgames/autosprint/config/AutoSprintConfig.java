package com.lunarcatgames.autosprint.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.property.ConfigProperty;

@ConfigName("settings")

public class AutoSprintConfig extends AddonConfig {

     @SwitchSetting
     private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

     @TextFieldSetting
     private final ConfigProperty<String> text = new ConfigProperty<>("Test");

    @Override
    public ConfigProperty<Boolean> enabled() {
        return enabled;
    }

    public ConfigProperty<String> text() {
        return text;
    }
}
