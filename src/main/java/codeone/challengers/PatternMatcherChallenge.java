package codeone.challengers;

import java.io.Serializable;


public class PatternMatcherChallenge {

  public static void main(String... doYourBest) {
    shoot(1l + "Type-1 Phaser");
    shoot(true);
    shoot(new StringBuffer("Plasma cannon").toString());
    shoot(new RuntimeException("Disruptor"));
  }

  static void shoot(Object object) {
    if (object instanceof StringBuffer) {
      System.out.println(((StringBuffer) object).append(":buffer"));
    } else if (object instanceof Comparable comparable) {
      System.out.println(comparable.equals(11 + "Type-1 Phaser"));
    } else if (object instanceof Serializable) {
      System.out.println(object.toString() + ":serializable");
    }
  }

}

/**
 * Alternatives:
 * A - true
 *     true:serializable
 *     Plasma cannon:buffer
 *     false
 *
 * B - false
 *     Plasma cannon:serializable
 *     java.lang.RuntimeException: Disruptor:serializable
 *
 * C - true
 *     true:serializable
 *     false
 *
 *  D - false
 *      false
 *      false
 *      java.lang.RuntimeException: Disruptor:serializable
 */
