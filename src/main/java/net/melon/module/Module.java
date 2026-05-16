package net.melon.module;

public abstract class Module {
    
    private String name;
    private String description;
    private boolean enabled = false;
    private int keyCode = -1;
    
    public Module(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public abstract void onEnable();
    public abstract void onDisable();
    public abstract void onUpdate();
    
    public void toggle() {
        if (enabled) {
            disable();
        } else {
            enable();
        }
    }
    
    public void enable() {
        this.enabled = true;
        onEnable();
    }
    
    public void disable() {
        this.enabled = false;
        onDisable();
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    public int getKeyCode() {
        return keyCode;
    }
    
    public void setKeyCode(int keyCode) {
        this.keyCode = keyCode;
    }
}