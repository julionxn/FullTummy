package net.pulga22.fulltummy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

public class FullTummyCommand implements CommandExecutor {

    private final FullTummy plugin;

    public FullTummyCommand(FullTummy plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player p && p.isOp()){
            ItemStack stack = p.getInventory().getItemInMainHand();
            if (!plugin.foodItems.contains(stack.getType())) return false;
            ItemMeta meta = stack.getItemMeta();
            meta.setUnbreakable(true);
            stack.setItemMeta(meta);
            return true;
        }
        return false;
    }

}
