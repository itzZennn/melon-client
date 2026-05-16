package net.melon.gui;

public class GuiManager {
    
    private String theme = "dark";
    
    public GuiManager() {
        System.out.println("🎨 GUI Manager initialisé (Theme: " + theme + ")");
    }
    
    public void setTheme(String theme) {
        this.theme = theme;
        System.out.println("🎨 Thème changé en: " + theme);
    }
    
    public String getTheme() {
        return theme;
    }
    
    public void renderMainMenu() {
        System.out.println("Rendering Main Menu...");
    }
    
    public void renderHUD() {
        System.out.println("Rendering HUD...");
    }
}