package com.brannon.elementismod.client.gui.handler;

import com.brannon.elementismod.client.gui.settings.Keybindings;
import com.brannon.elementismod.reference.Key;
import com.brannon.elementismod.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;


/**
 * Created by Brannon on 2/12/2014.
 */
public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        if (Keybindings.charge.isPressed())
        {
            return Key.CHARGED;
        }
        else if (Keybindings.released.isPressed())
        {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        LogHelper.info(getPressedKeybinding());
    }
}
