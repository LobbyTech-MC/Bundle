package org.achymake.bundle.handlers;

import org.achymake.bundle.Bundle;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scheduler.BukkitTask;

public class ScheduleHandler {
    private Bundle getInstance() {
        return Bundle.getInstance();
    }
    private BukkitScheduler getScheduler() {
        return getInstance().getBukkitScheduler();
    }
    public BukkitTask runLater(Runnable runnable, long tick) {
        return getScheduler().runTaskLater(getInstance(), runnable, tick);
    }
    public void runAsynchronously(Runnable runnable) {
        getScheduler().runTaskAsynchronously(getInstance(), runnable);
    }
    public void disable() {
        getScheduler().cancelTasks(getInstance());
    }
}