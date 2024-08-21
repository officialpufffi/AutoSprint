package com.lunarcatgames.autosprint;

import com.lunarcatgames.autosprint.config.AutoSprintConfig;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class AutoSprint extends LabyAddon<AutoSprintConfig> {

    @Override
    protected void enable() {
        registerSettingCategory();
    }

    @Override
    protected Class<? extends AutoSprintConfig> configurationClass() {
        return AutoSprintConfig.class;
    }
}
