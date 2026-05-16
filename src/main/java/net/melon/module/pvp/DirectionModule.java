package net.melon.module.pvp;

import net.melon.module.Module;

public class DirectionModule extends Module {
    
    public DirectionModule() {
        super("Direction", "Affiche une boussole de navigation");
        setKeyCode(32); // D key
    }
    
    @Override
    public void onEnable() {
        System.out.println("✅ Direction activée");
    }
    
    @Override
    public void onDisable() {
        System.out.println("❌ Direction désactivée");
    }
    
    @Override
    public void onUpdate() {
        // Logique boussole
    }
}