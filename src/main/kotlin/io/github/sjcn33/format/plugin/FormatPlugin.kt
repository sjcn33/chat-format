package io.github.sjcn33.format.plugin

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerChatEvent
import org.bukkit.plugin.java.JavaPlugin

class FormatPlugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("${ChatColor.YELLOW}[Format] : ==============================")
        logger.info("${ChatColor.YELLOW}[Format] : Enable FormatPlugin")
        logger.info("${ChatColor.YELLOW}[Format] : by sjcn33")
        logger.info("${ChatColor.YELLOW}[Format] : ==============================")
    }

    @EventHandler
    fun event(event: PlayerChatEvent) {

    }
}