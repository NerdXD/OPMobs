package com.nerdxd.opmobs.Mobs;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Skeleton;
import org.bukkit.inventory.ItemStack;

public class CustomSkeleton {

    public CustomSkeleton(Skeleton skell) {

        ItemStack hel = new ItemStack(Material.NETHERITE_HELMET);
        ItemStack chest = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemStack leg = new ItemStack(Material.NETHERITE_LEGGINGS);
        ItemStack boots = new ItemStack(Material.NETHERITE_BOOTS);
        ItemStack bow = new ItemStack(Material.BOW);

        hel.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        chest.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        leg.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        boots.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 7);
        bow.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);

        skell.getEquipment().setHelmet(hel);
        skell.getEquipment().setChestplate(chest);
        skell.getEquipment().setLeggings(leg);
        skell.getEquipment().setBoots(boots);
        skell.getEquipment().setItemInMainHand(bow);

    }

}
