package com.j3ff97.nommablez.gui;

import com.j3ff97.nommablez.handler.ConfigurationHandler;
import com.j3ff97.nommablez.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),Reference.ID,false,false,GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
