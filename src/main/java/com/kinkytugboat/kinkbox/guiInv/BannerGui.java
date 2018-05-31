//package com.kinkytugboat.kinkbox.guiInv;
//
//import org.bukkit.Bukkit;
//import org.bukkit.Material;
//import org.bukkit.entity.Player;
//import org.bukkit.event.EventHandler;
//import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.InventoryClickEvent;
//import org.bukkit.inventory.Inventory;
//import org.bukkit.inventory.ItemStack;
//
//import java.util.Random;
//
//public class BannerGui implements Listener {
//    //delete me
//    static int bannerMax = 5;
//    static int bannerCount = 3;
//
//    static Random ran = new Random();
//    Player
//
//    //delete me
//    private static Inventory bannerHome = Bukkit.createInventory(null, 27, "My custom Inventory!");
//
//    static {
//        int glassI;
//        for (glassI = 0; glassI < 3; glassI++){
//            bannerHome.setItem(0 + glassI * 9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
//            bannerHome.setItem(1 + glassI * 9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
//            bannerHome.setItem(7 + glassI * 9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
//            bannerHome.setItem(8 + glassI * 9, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15));
//        }
//        int bannerI;
//        for (bannerI = 0; bannerI < bannerMax; bannerI++ ){
//            if (bannerI < bannerCount){
//                bannerHome.setItem(2 + bannerI, new ItemStack(Material.BANNER, 1, (byte) ran.nextInt(16)));
//            } else
//
//        }
//        bannerHome.setItem(3, new ItemStack(Material.BANNER, 1));
//        bannerHome.setItem(8, new ItemStack(Material.GOLD_BLOCK, 1));
//    }
//    @EventHandler
//    public void onInventoryClick(InventoryClickEvent event) {
//        Player player = (Player) event.getWhoClicked(); // The player that clicked the item
//        ItemStack clicked = event.getCurrentItem(); // The item that was clicked
//        Inventory inventory = event.getInventory(); // The inventory that was clicked in
//        if (inventory.getName().equals(myInventory.getName())) { // The inventory is our custom Inventory
//            if (clicked.getType() == Material.DIRT) { // The item that the player clicked it dirt
//                event.setCancelled(true); // Make it so the dirt is back in its original spot
//                player.closeInventory(); // Closes there inventory
//                player.getInventory().addItem(new ItemStack(Material.DIRT, 1)); // Adds dirt
//            }
//        }
//    }
//
//}