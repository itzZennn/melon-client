package net.melon.settings;

import com.google.gson.*;
import java.io.*;

public class SettingsManager {
    
    private JsonObject config;
    private File configFile;
    
    public SettingsManager() {
        this.configFile = new File("config/client.json");
        loadConfigs();
    }
    
    public void loadConfigs() {
        if (configFile.exists()) {
            try (FileReader reader = new FileReader(configFile)) {
                config = JsonParser.parseReader(reader).getAsJsonObject();
                System.out.println("✅ Configurations chargées");
            } catch (IOException e) {
                e.printStackTrace();
                createDefaultConfig();
            }
        } else {
            createDefaultConfig();
        }
    }
    
    private void createDefaultConfig() {
        config = new JsonObject();
        config.addProperty("theme", "dark");
        config.addProperty("fpsBoost", true);
        System.out.println("📝 Configuration par défaut créée");
    }
    
    public void saveConfigs() {
        try (FileWriter writer = new FileWriter(configFile)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            writer.write(gson.toJson(config));
            System.out.println("✅ Configurations sauvegardées");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Object getSetting(String key, Object defaultValue) {
        if (config.has(key)) {
            return config.get(key);
        }
        return defaultValue;
    }
    
    public void setSetting(String key, Object value) {
        if (value instanceof String) {
            config.addProperty(key, (String) value);
        } else if (value instanceof Number) {
            config.addProperty(key, (Number) value);
        } else if (value instanceof Boolean) {
            config.addProperty(key, (Boolean) value);
        }
    }
}