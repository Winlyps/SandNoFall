package winlyps.sandNoFall

import org.bukkit.Material
import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityChangeBlockEvent

class SandNoFallListener(private val plugin: SandNoFall) : Listener {

    @EventHandler
    fun onEntityChangeBlock(event: EntityChangeBlockEvent) {
        if (event.entityType == EntityType.FALLING_BLOCK) {
            val fallingBlock = event.block.type
            if (fallingBlock == Material.SAND || fallingBlock == Material.RED_SAND || fallingBlock == Material.SUSPICIOUS_SAND) {
                event.isCancelled = true
            }
        }
    }
}