package org.achymake.bundle.handlers;

import org.achymake.bundle.Bundle;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;

public class InventoryHandler {
    private final HashMap<Player, Inventory> bundles = new HashMap<>();
    private Bundle getInstance() {
        return Bundle.getInstance();
    }
    public Inventory create(Player player, int size, String title) {
        return getInstance().getServer().createInventory(player, size, title);
    }
    public boolean hasBundle(Player player) {
        return getBundles().containsKey(player);
    }
    public Inventory getBundle(Player player) {
        return getBundles().get(player);
    }
    public HashMap<Player, Inventory> getBundles() {
        return bundles;
    }
}