package com.brannon.elementismod.init;

import com.brannon.elementismod.item.ItemElementisMod;
import com.brannon.elementismod.item.ItemUnPurifiedWaterJewel;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Brannon on 2/12/2014.
 */
public class ModItems
{
    public static final ItemElementisMod UnPurifiedWaterJewel = new ItemUnPurifiedWaterJewel();

    public static void init()
    {
        GameRegistry.registerItem(UnPurifiedWaterJewel, "UnPurifiedWaterJewel");
    }
}
