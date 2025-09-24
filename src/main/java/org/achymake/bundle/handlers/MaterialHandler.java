package org.achymake.bundle.handlers;

import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MaterialHandler {
    public boolean isBundle(ItemStack itemStack) {
        return Material.BUNDLE == itemStack.getType();
    }
    public boolean isShulkerBox(ItemStack itemStack) {
        return Tag.SHULKER_BOXES.isTagged(itemStack.getType());
    }
    public boolean isStorages(ItemStack itemStack) {
        if (itemStack != null) {
            return isBundle(itemStack) || isShulkerBox(itemStack);
        } else return false;
    }
    public Enchantment getEnchantment(String enchantmentName) {
        return Enchantment.getByName(enchantmentName.toUpperCase());
    }
    public boolean isEnchantment(String enchantmentName) {
        return getEnchantment(enchantmentName) != null;
    }
    public int getEnchantment(ItemMeta itemMeta, String enchantmentName) {
        if (isEnchantment(enchantmentName)) {
            return itemMeta.getEnchantLevel(getEnchantment(enchantmentName));
        } else return 0;
    }
}