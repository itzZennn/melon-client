package net.melon.module.pvp;

import net.melon.module.Module;

public class PotionStatusModule extends Module {
    
    public PotionStatusModule() {
        super("Potion Status", "Affiche les effets de potion actifs");
        setKeyCode(18); // E key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Potion Status activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Potion Status désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Affichage effets potion
    }
}