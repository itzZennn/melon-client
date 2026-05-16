package net.melon;

import net.melon.event.EventManager;
import net.melon.module.ModuleManager;
import net.melon.gui.GuiManager;
import net.melon.settings.SettingsManager;

public class MelonClient {
    
    private static final String NAME = "Melon Client";
    private static final String VERSION = "1.0.0";
    private static final String TARGET_VERSION = "1.8.9";
    
    private static MelonClient instance;
    
    private EventManager eventManager;
    private ModuleManager moduleManager;
    private GuiManager guiManager;
    private SettingsManager settingsManager;
    
    public MelonClient() {
        instance = this;
        this.eventManager = new EventManager();
        this.moduleManager = new ModuleManager();
        this.guiManager = new GuiManager();
        this.settingsManager = new SettingsManager();
        
        initClient();
    }
    
    private void initClient() {
        System.out.println("🍈 " + NAME + " v" + VERSION);
        System.out.println("Target: Minecraft " + TARGET_VERSION);
        System.out.println("Initializing...");
        
        // Charger les modules
        moduleManager.registerModules();
        
        // Charger les configurations
        settingsManager.loadConfigs();
        
        System.out.println("✅ Client initialisé avec succès!");
    }
    
    public static void main(String[] args) {
        new MelonClient();
    }
    
    public static MelonClient getInstance() {
        return instance;
    }
    
    public EventManager getEventManager() {
        return eventManager;
    }
    
    public ModuleManager getModuleManager() {
        return moduleManager;
    }
    
    public GuiManager getGuiManager() {
        return guiManager;
    }
    
    public SettingsManager getSettingsManager() {
        return settingsManager;
    }
}