package net.melon.event;

import java.util.*;

public class EventManager {
    
    private Map<Class<?>, List<EventListener>> listeners = new HashMap<>();
    
    public void register(EventListener listener) {
        Class<?> eventType = listener.getEventType();
        listeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }
    
    public void unregister(EventListener listener) {
        Class<?> eventType = listener.getEventType();
        if (listeners.containsKey(eventType)) {
            listeners.get(eventType).remove(listener);
        }
    }
    
    public void post(Event event) {
        List<EventListener> eventListeners = listeners.get(event.getClass());
        if (eventListeners != null) {
            for (EventListener listener : eventListeners) {
                listener.onEvent(event);
            }
        }
    }
}