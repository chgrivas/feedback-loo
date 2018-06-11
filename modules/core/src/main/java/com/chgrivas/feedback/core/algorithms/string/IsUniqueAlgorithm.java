package com.chgrivas.feedback.core.algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class IsUniqueAlgorithm {

  public boolean isUnique(String input) {
    Map<Character, Boolean> appearanceMap = new HashMap<>();

    for (int i = 0; i < input.length(); i++) {

      char c = input.charAt(i);
      if (appearanceMap.get(c) != null) {
        return false;
      }
      appearanceMap.put(c, true);
    }
    return true;
  }
}
