package com.brannon.elementismod.block;

import com.brannon.elementismod.creativetab.CreativeTabElementisMod;
import com.brannon.elementismod.init.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import java.util.Random;

/**
 * Created by Brannon on 2/12/2014.
 */
public class BlockUnPurifiedWaterJewelOre extends BlockElementisMod
{
    public BlockUnPurifiedWaterJewelOre()
    {
        super();
        this.setBlockName("UnPurifiedWaterJewelOre");
        this.setBlockTextureName("UnPurifiedWaterJewelOre");
        this.setHardness(3.0f);
        this.setHarvestLevel("pickaxe", 2);

    }



    @Override
    public Item getItemDropped(int par1, Random random, int par2)
    {
        return ModItems.UnPurifiedWaterJewel;
    }

    @Override
    public int quantityDropped(Random random)
    {
        return (random.nextInt(2) + 1);
    }

}
