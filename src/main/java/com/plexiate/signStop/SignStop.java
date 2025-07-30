package com.plexiate.signStop;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

import java.util.EnumSet;
import java.util.Set;

public class SignStop extends JavaPlugin implements Listener {

    private static final Set<Material> SIGN_MATERIALS = EnumSet.of(
            Material.OAK_SIGN,
            Material.SPRUCE_SIGN,
            Material.BIRCH_SIGN,
            Material.JUNGLE_SIGN,
            Material.ACACIA_SIGN,
            Material.DARK_OAK_SIGN,
            Material.CRIMSON_SIGN,
            Material.WARPED_SIGN,
            Material.BAMBOO_SIGN,
            Material.CHERRY_SIGN,
            Material.MANGROVE_SIGN,

            Material.OAK_WALL_SIGN,
            Material.SPRUCE_WALL_SIGN,
            Material.BIRCH_WALL_SIGN,
            Material.JUNGLE_WALL_SIGN,
            Material.ACACIA_WALL_SIGN,
            Material.DARK_OAK_WALL_SIGN,
            Material.CRIMSON_WALL_SIGN,
            Material.WARPED_WALL_SIGN,
            Material.BAMBOO_WALL_SIGN,
            Material.CHERRY_WALL_SIGN,
            Material.MANGROVE_WALL_SIGN,

            Material.OAK_HANGING_SIGN,
            Material.SPRUCE_HANGING_SIGN,
            Material.BIRCH_HANGING_SIGN,
            Material.JUNGLE_HANGING_SIGN,
            Material.ACACIA_HANGING_SIGN,
            Material.DARK_OAK_HANGING_SIGN,
            Material.CRIMSON_HANGING_SIGN,
            Material.WARPED_HANGING_SIGN,
            Material.BAMBOO_HANGING_SIGN,
            Material.CHERRY_HANGING_SIGN,
            Material.MANGROVE_HANGING_SIGN,

            Material.OAK_WALL_HANGING_SIGN,
            Material.SPRUCE_WALL_HANGING_SIGN,
            Material.BIRCH_WALL_HANGING_SIGN,
            Material.JUNGLE_WALL_HANGING_SIGN,
            Material.ACACIA_WALL_HANGING_SIGN,
            Material.DARK_OAK_WALL_HANGING_SIGN,
            Material.CRIMSON_WALL_HANGING_SIGN,
            Material.WARPED_WALL_HANGING_SIGN,
            Material.BAMBOO_WALL_HANGING_SIGN,
            Material.CHERRY_WALL_HANGING_SIGN,
            Material.MANGROVE_WALL_HANGING_SIGN
    );

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SignStop enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SignStop disabled.");
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        Block block = event.getBlock();

        if (SIGN_MATERIALS.contains(block.getType()) && player.hasPermission("signstop.prevent")) {
            event.setCancelled(true);
//            player.sendMessage("§7[§aCrafters§7] §fSigns are disabled for your account.");
        }
    }
}
