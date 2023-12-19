package net.pulga22.fulltummy;

import org.bukkit.Material;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Set;

public final class FullTummy extends JavaPlugin {

    public final Set<Material> foodItems = Set.of(
            Material.APPLE,
            Material.GOLDEN_APPLE,
            Material.ENCHANTED_GOLDEN_APPLE,
            Material.MELON_SLICE,
            Material.SWEET_BERRIES,
            Material.GLOW_BERRIES,
            Material.CHORUS_FRUIT,
            Material.CARROT,
            Material.GOLDEN_CARROT,
            Material.POTATO,
            Material.BAKED_POTATO,
            Material.POISONOUS_POTATO,
            Material.BEETROOT,
            Material.KELP,
            Material.COOKED_BEEF,
            Material.BEEF,
            Material.PORKCHOP,
            Material.COOKED_PORKCHOP,
            Material.MUTTON,
            Material.COOKED_MUTTON,
            Material.CHICKEN,
            Material.COOKED_CHICKEN,
            Material.RABBIT,
            Material.COOKED_RABBIT,
            Material.COD,
            Material.COOKED_COD,
            Material.SALMON,
            Material.COOKED_SALMON,
            Material.TROPICAL_FISH,
            Material.PUFFERFISH,
            Material.BREAD,
            Material.COOKIE,
            Material.CAKE,
            Material.PUMPKIN_PIE,
            Material.ROTTEN_FLESH,
            Material.SPIDER_EYE,
            Material.MUSHROOM_STEW,
            Material.BEETROOT_SOUP,
            Material.RABBIT_STEW,
            Material.SUSPICIOUS_STEW
    );

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EatEvent(this), this);
        PluginCommand command = getCommand("fulltummy");
        if (command == null) return;
        command.setExecutor(new FullTummyCommand(this));
    }

}
