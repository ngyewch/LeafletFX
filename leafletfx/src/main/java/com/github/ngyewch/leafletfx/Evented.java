package com.github.ngyewch.leafletfx;

import java.util.function.Consumer;

/**
 * Event support.
 */
public interface Evented {

  /**
   * Adds a listener to a particular event type.
   *
   * @param type     Event type.
   * @param consumer Event consumer.
   */
  void on(String type, Consumer<MapEvent> consumer);

  /**
   * Removes a listener from a particular event type.
   *
   * @param type     Event type.
   * @param consumer Event consumer.
   */
  void off(String type, Consumer<MapEvent> consumer);

  /**
   * Removes all listeners to a particular event type.
   *
   * @param type Event type.
   */
  void off(String type);

  /**
   * Removes all listeners.
   */
  void off();

  /**
   * Adds a listener that will only get fired once to a particular event type.
   *
   * @param type     Event type.
   * @param consumer Event consumer.
   */
  void once(String type, Consumer<MapEvent> consumer);
}
