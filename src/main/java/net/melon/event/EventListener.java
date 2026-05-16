package net.melon.event;

public interface EventListener {
    void onEvent(Event event);
    Class<?> getEventType();
}