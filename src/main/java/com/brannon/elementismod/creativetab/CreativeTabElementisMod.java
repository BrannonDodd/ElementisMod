package com.brannon.elementismod.creativetab;

import com.brannon.elementismod.init.ModItems;
import com.brannon.elementismod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Brannon on 2/12/2014.
 */
public class CreativeTabElementisMod
{
    public static final CreativeTabs ELEMENTIS_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.UnPurifiedWaterJewel;
        }

    };
}
