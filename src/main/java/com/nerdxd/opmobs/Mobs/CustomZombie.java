package com.nerdxd.opmobs.Mobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;

public class CustomZombie {

    public CustomZombie(Zombie zom) {
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

        zom.getEquipment().setHelmet(hel);
        zom.getEquipment().setChestplate(chest);
        zom.getEquipment().setLeggings(leg);
        zom.getEquipment().setBoots(boots);
        zom.getEquipment().setItemInMainHand(sword);
    }

}
