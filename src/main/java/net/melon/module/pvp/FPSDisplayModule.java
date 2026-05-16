package net.melon.module.pvp;

import net.melon.module.Module;

public class FPSDisplayModule extends Module {
    
    private int fps = 0;
    
    public FPSDisplayModule() {
        super("FPS Display", "Affiche les FPS en temps réel");
        setKeyCode(24); // O key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ FPS Display activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ FPS Display désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Calcul des FPS
    }
    
    public int getFPS() {
        return fps;
    }
}