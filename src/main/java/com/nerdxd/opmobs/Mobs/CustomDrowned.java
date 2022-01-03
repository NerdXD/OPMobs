package com.nerdxd.opmobs.Mobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Drowned;
import org.bukkit.inventory.ItemStack;

public class CustomDrowned {

    public CustomDrowned(Drowned d) {

        ItemStack t = new ItemStack(Material.TRIDENT);
        t.addUnsafeEnchantment(Enchantment.IMPALING, 10);
        d.getEquipment().setItemInMainHand(t);

    }

}
