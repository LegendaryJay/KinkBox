package com.kinkytugboat.kinkbox.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Banner;
import org.bukkit.block.Block;
import org.bukkit.block.banner.Pattern;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Iterator;
import java.util.List;


public class BannerPlace implements Listener {
    // Executes before the second method because it has a much lower priority.
    @EventHandler(priority = EventPriority.NORMAL)
    public void onBannerPlace(PlayerInteractEvent event) {
        if
        Player player = event.getPlayer();
        ItemStack itemsInHand = event.getItem();
        if (itemsInHand.getType() == Material.BANNER && )


        player.sendMessage(itemsInHand.getType().name());
        player.sendMessage(event.getItem().toString());
//        Block block = event.getBlock();
//        Player player = event.getPlayer();
//
//        player.sendMessage(ChatColor.GOLD + "You placed: " + ChatColor.AQUA + block.getType().toString().toUpperCase());
//        if (block.getState() instanceof Banner) {
//            Banner banner = (Banner) block.getState();
//            player.sendMessage("Base: " + banner.getBaseColor().name());
//
//            List<Pattern> patterns = banner.getPatterns();
//            int i = 1;
//            Iterator<Pattern> iterator = patterns.iterator();
//            while (iterator.hasNext()) {
//                Pattern tempPattern = iterator.next();
//                player.sendMessage("Layer "+ i + ": " + tempPattern.getColor() + " " + tempPattern.getPattern());
//                i++;
//            }
//        }
    }
}
