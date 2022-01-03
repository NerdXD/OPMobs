package com.nerdxd.opmobs.Mobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class CustomHusk {

    public CustomHusk(Husk h) {

        ItemStack hel = new ItemStack(Material.NETHERITE_HELMET);
        ItemStack chest = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemStack leg = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);

        hel.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        sword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);

        h.getEquipment().setHelmet(hel);
        h.getEquipment().setChestplate(chest);
        h.getEquipment().setLeggings(leg);
        h.getEquipment().setBoots(boots);
        h.getEquipment().setItemInMainHand(sword);
    }
}
