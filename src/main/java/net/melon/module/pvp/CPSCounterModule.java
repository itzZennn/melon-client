package net.melon.module.pvp;

import net.melon.module.Module;

public class CPSCounterModule extends Module {
    
    private int clicksPerSecond = 0;
    private long lastClickTime = 0;
    
    public CPSCounterModule() {
        super("CPS Counter", "Affiche les clics par seconde");
        setKeyCode(23); // I key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ CPS Counter activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ CPS Counter désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Logique de comptage des clics
    }
    
    public int getCPS() {
        return clicksPerSecond;
    }
}