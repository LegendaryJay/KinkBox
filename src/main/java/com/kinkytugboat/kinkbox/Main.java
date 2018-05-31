package com.kinkytugboat.kinkbox;

import com.kinkytugboat.kinkbox.banner.BannerEnchant.BannerGlow;
import com.kinkytugboat.kinkbox.commands.TestCommand;
import com.kinkytugboat.kinkbox.listeners.BannerPlace;
import org.bukkit.plugin.java.JavaPlugin;
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("kit").setExecutor(new TestCommand());
        getServer().getPluginManager().registerEvents(new BannerPlace(), this);
        BannerGlow.registerBannerGlow();


    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}