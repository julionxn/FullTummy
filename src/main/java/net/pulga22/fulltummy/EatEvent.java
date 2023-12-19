package net.pulga22.fulltummy;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EatEvent implements Listener {

    private final FullTummy plugin;

    public EatEvent(FullTummy plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onEat(FoodLevelChangeEvent e){
        if (e.getEntity() instanceof Player p){
            ItemStack itemStack = p.getActiveItem();
            if (!plugin.foodItems.contains(itemStack.getType())) return;
            if (!itemStack.getItemMeta().isUnbreakable()) return;
            PlayerInventory playerInventory = p.getInventory();
            playerInventory.setItem(playerInventory.getHeldItemSlot(), itemStack);
        }
    }

}
