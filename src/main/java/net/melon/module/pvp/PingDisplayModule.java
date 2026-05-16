package net.melon.module.pvp;

import net.melon.module.Module;

public class PingDisplayModule extends Module {
    
    private int ping = 0;
    
    public PingDisplayModule() {
        super("Ping Display", "Affiche la latence du serveur");
        setKeyCode(37); // K key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Ping Display activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Ping Display désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Récupération du ping
    }
    
    public int getPing() {
        return ping;
    }
}