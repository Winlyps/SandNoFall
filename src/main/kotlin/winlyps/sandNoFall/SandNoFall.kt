package winlyps.sandNoFall

import org.bukkit.plugin.java.JavaPlugin

class SandNoFall : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SandNoFallListener(this), this)
        logger.info("SandNoFall plugin has been enabled.")
    }

    override fun onDisable() {
        logger.info("SandNoFall plugin has been disabled.")
    }
}