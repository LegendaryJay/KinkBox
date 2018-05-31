package com.kinkytugboat.kinkbox.banner;

import org.bukkit.Location;
import org.bukkit.block.banner.Pattern;

import java.util.UUID;

public class BannerObject {
    UUID owner;
    String warpName;
    String warpID;
    Location bannerLoc;
    Pattern pattern;

    public BannerObject(UUID owner, String warpName, String warpID, Location bannerLoc, Pattern pattern) {
        this.owner = owner;
        this.warpName = warpName;
        this.warpID = warpID;
        this.bannerLoc = bannerLoc;
        this.pattern = pattern;
    }

    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }

    public String getWarpName() {
        return warpName;
    }

    public void setWarpName(String warpName) {
        this.warpName = warpName;
    }

    public String getWarpID() {
        return warpID;
    }

    public void setWarpID(String warpID) {
        this.warpID = warpID;
    }

    public Location getBannerLoc() {
        return bannerLoc;
    }

    public void setBannerLoc(Location bannerLoc) {
        this.bannerLoc = bannerLoc;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
}
