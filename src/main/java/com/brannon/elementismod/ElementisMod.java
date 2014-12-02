package com.brannon.elementismod;

import com.brannon.elementismod.client.gui.handler.KeyInputEventHandler;
import com.brannon.elementismod.handler.ConfigHandler;
import com.brannon.elementismod.init.ModBlocks;
import com.brannon.elementismod.init.ModItems;
import com.brannon.elementismod.init.Recipes;
import com.brannon.elementismod.proxy.IProxy;
import com.brannon.elementismod.reference.Reference;
import com.brannon.elementismod.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by Brannon on 2/12/2014.
 */
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version= Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class ElementisMod
{
    @Instance(Reference.MOD_ID)
    public static ElementisMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        LogHelper.info("Pre Initialization Complete");
        ModItems.init();
        ModBlocks.init();
        proxy.registerKeyBindings();

    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization Complete");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }

}
