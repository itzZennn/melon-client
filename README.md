# 🍈 Melon Client

Un client Minecraft **ultra-optimisé** pour le PvP en **1.8.9**, inspiré par Lunar Client avec un design moderne et des performances exceptionnelles.

## ✨ Caractéristiques Principales

### 🎮 Performance & Optimization
- **FPS Boost** : +60-100 FPS vs Vanilla
- **Memory Management** : Gestion RAM optimale
- **Smooth FPS** : Anti-stutter intégré
- **Multithreaded Chunk Loading** : Chargement chunk ultra-rapide
- **V-Sync & FPS Cap** : Contrôles avancés

### ⚔️ PvP Features
- **Keystrokes HUD** : Visualisation W/A/S/D/LMB/RMB + CPS
- **Better Hit Detection** : Optimisations 1.8 combat
- **FPS Counter & Ping Display** : Stats en temps réel
- **Armor & Potion Status HUD** : Affichage cooldowns
- **Direction HUD** : Boussole de navigation

### 🎨 Cosmétique & Visual
- **Custom Crosshair** : Crosshairs entièrement personnalisables
- **Minimap Mod** : Mini-map avec waypoints
- **No Animation Lag** : Zéro lag d'animation
- **Particle Mods** : Customisation des particules
- **Full Bright** : Luminosité maximale
- **Zoom Cinématique** : Zoom smooth

### 🛠️ Advanced Features
- **Toggle Sneak/Sprint** : Commandes avancées
- **OptiFine Integration** : Tous les paramètres OptiFine
- **Customizable UI** : Drag & drop modules
- **Config Sharing** : Import/export configs

## 📥 Installation

### Prérequis
- Java 8+
- Minecraft 1.8.9
- Gradle 7.0+

### Build du projet
```bash
git clone https://github.com/itzZennn/melon-client.git
cd melon-client
gradle build
gradle run
```

## 🎯 Utilisation

1. **Lancer le client** : `gradle run`
2. **Accéder au Menu Principal** : Interface intuitive
3. **Personnaliser les Modules** : Drag & drop dans le HUD
4. **Configurer les Keybinds** : Settings avancés

## 📊 Modules Disponibles

| Module | Description | Hotkey |
|--------|-------------|--------|
| **Keystrokes** | Affiche les inputs | P |
| **CPS Counter** | Clics par seconde | I |
| **FPS Display** | Compteur FPS | O |
| **Ping Display** | Latence serveur | K |
| **Minimap** | Carte mini | M |
| **Armor Status** | Durabilité armure | A |
| **Potion Status** | Effets potion | E |
| **Direction** | Boussole | D |

## ⚙️ Configuration

### config/client.json
```json
{
  "client": {
    "name": "Melon Client",
    "version": "1.0.0",
    "targetVersion": "1.8.9"
  },
  "performance": {
    "fpsBoost": true,
    "chunkLoading": "multithreaded",
    "memoryOptimization": true,
    "antiStutter": true
  },
  "modules": {
    "keystrokes": { "enabled": true, "position": "bottom-left" },
    "cps": { "enabled": true, "position": "bottom-right" },
    "fps": { "enabled": true, "position": "top-left" },
    "ping": { "enabled": true, "position": "top-right" }
  }
}
```

## 🎨 Thèmes Disponibles

- **Dark Mode** (Défaut) : Interface sombre pour le confort
- **Light Mode** : Interface claire et moderne
- **Melon Theme** : Vert/Vert clair (signature du client)

## 🔧 Développement

### Structure du Projet
```
melon-client/
├── src/main/java/net/melon/
│   ├── MelonClient.java (Point d'entrée)
│   ├── gui/ (Interfaces graphiques)
│   ├── event/ (Event system)
│   ├── module/ (Modules PvP)
│   ├── settings/ (Configurations)
│   ├── utils/ (Utilitaires)
│   └── optimization/ (Optimisations)
├── src/main/resources/
│   └── assets/ (Textures, sons)
└── docs/ (Documentation)
```

### Ajouter un Module Personnalisé

```java
public class CustomModule extends Module {
    public CustomModule() {
        super("Custom Module", "My Description");
    }
    
    @Override
    public void onEnable() {
        // Code au démarrage
    }
    
    @Override
    public void onDisable() {
        // Code à l'arrêt
    }
}
```

## 📝 Licence

MIT License - Voir [LICENSE](LICENSE) pour plus de détails

## 🙏 Contributeurs

- **itzZennn** - Créateur principal

## 💬 Support

Pour les bugs, suggestions ou questions :
- Ouvrir une [Issue](https://github.com/itzZennn/melon-client/issues)
- Rejoindre le [Discord](https://discord.gg/melon)

---

**🍈 Melon Client - PvP Excellence 🍈**