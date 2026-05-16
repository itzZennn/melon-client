package net.melon.module.pvp;

import net.melon.module.Module;

public class MinimapModule extends Module {
    
    public MinimapModule() {
        super("Minimap", "Affiche une mini-carte avec waypoints");
        setKeyCode(50); // M key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Minimap activée");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Minimap désactivée");
    }
    
    @Override
    public void onUpdate() {
        // Logique de la mini-carte
    }
}