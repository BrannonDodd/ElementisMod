package com.brannon.elementismod.client.gui.settings;

import com.brannon.elementismod.reference.Names;
import net.java.games.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by Brannon on 2/12/2014.
 */
public class Keybindings
{
    public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE, org.lwjgl.input.Keyboard.KEY_C, Names.Keys.CATERGORY);
    public static KeyBinding released = new KeyBinding(Names.Keys.RELEASE, org.lwjgl.input.Keyboard.KEY_R, Names.Keys.CATERGORY);
}
