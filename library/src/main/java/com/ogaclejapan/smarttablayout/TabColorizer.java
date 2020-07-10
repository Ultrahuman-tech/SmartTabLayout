package com.ogaclejapan.smarttablayout;

/**
 * Allows complete control over the colors drawn in the tab layout. Set with
 * {@link SmartTabLayout#setCustomTabColorizer(TabColorizer)}.
 */
public interface TabColorizer {

  /**
   * @return return the color of the indicator used when {@code position} is selected.
   */
  int getIndicatorColor(int position);

  /**
   * @return return the color of the divider drawn to the right of {@code position}.
   */
  int getDividerColor(int position);

}
