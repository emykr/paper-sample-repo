package kr.chayyo.sample

import org.bukkit.plugin.java.JavaPlugin

class SamplePlugin : JavaPlugin() {

    companion object {
        const val PLUGIN_NAME = "SamplePlugin"
    }

    override fun onEnable() {
        logger.info("$PLUGIN_NAME has been enabled!")
    }

    override fun onDisable() {
        logger.info("$PLUGIN_NAME has been disabled!")
    }
}
