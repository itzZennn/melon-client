package net.melon.module.pvp;

import net.melon.module.Module;

public class ArmorStatusModule extends Module {
    
    public ArmorStatusModule() {
        super("Armor Status", "Affiche la durabilité de l'armure");
        setKeyCode(30); // A key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Armor Status activé");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Armor Status désactivé");
    }
    
    @Override
    public void onUpdate() {
        // Affichage durabilité armure
    }
}