package net.melon.module;

import net.melon.module.pvp.*;
import java.util.*;

public class ModuleManager {
    
    private List<Module> modules = new ArrayList<>();
    
    public void registerModules() {
        // Modules PvP
        registerModule(new KeystrokesModule());
        registerModule(new CPSCounterModule());
        registerModule(new FPSDisplayModule());
        registerModule(new PingDisplayModule());
        registerModule(new MinimapModule());
        registerModule(new ArmorStatusModule());
        registerModule(new PotionStatusModule());
        registerModule(new DirectionModule());
    }
    
    public void registerModule(Module module) {
        modules.add(module);
        System.out.println("📦 Registré: " + module.getName());
    }
    
    public Module getModule(String name) {
        for (Module module : modules) {
            if (module.getName().equalsIgnoreCase(name)) {
                return module;
            }
        }
        return null;
    }
    
    public List<Module> getModules() {
        return new ArrayList<>(modules);
    }
    
    public List<Module> getEnabledModules() {
        List<Module> enabled = new ArrayList<>();
        for (Module module : modules) {
            if (module.isEnabled()) {
                enabled.add(module);
            }
        }
        return enabled;
    }
}