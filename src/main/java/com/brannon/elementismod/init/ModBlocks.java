package com.brannon.elementismod.init;

import com.brannon.elementismod.block.BlockElementisMod;
import com.brannon.elementismod.block.BlockUnPurifiedWaterJewelOre;
import com.brannon.elementismod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Brannon on 2/12/2014.
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockElementisMod UnPurifiedWaterJewelOre = new BlockUnPurifiedWaterJewelOre();

    public static void init()
    {
        GameRegistry.registerBlock(UnPurifiedWaterJewelOre, "UnPurifiedWaterJewelOre");
    }
}
