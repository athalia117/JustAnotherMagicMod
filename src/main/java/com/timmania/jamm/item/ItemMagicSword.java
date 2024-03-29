package com.timmania.jamm.item;

import com.timmania.jamm.Jamm;
import net.minecraft.item.ItemSword;

public class ItemMagicSword extends ItemSword {

    public ItemMagicSword(ToolMaterial material, String name){
        super(material);

        this.setUnlocalizedName(Jamm.MODID + "." + name);
        this.setRegistryName(name);
        this.setCreativeTab(Jamm.JAMM_TAB);
    }
}
