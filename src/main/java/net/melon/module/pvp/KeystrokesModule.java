package net.melon.module.pvp;

import net.melon.module.Module;

public class KeystrokesModule extends Module {
    
    public KeystrokesModule() {
        super("Keystrokes", "Affiche les touches W/A/S/D et les clics");
        setKeyCode(25); // P key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Keystrokes activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Keystrokes désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Logique de mise à jour du HUD
    }
}