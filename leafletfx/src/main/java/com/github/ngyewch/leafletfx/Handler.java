package com.github.ngyewch.leafletfx;

/**
 * Map interaction handler.
 */
public interface Handler {

  /**
   * Enables the handler.
   */
  void enable();

  /**
   * Disables the handler.
   */
  void disable();

  /**
   * Returns true if the handler is enabled.
   *
   * @return true if the handler is enabled.
   */
  boolean enabled();
}
