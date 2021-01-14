package codeone.challengers;

import java.io.Serializable;

/**
 * Rules
 * Permitted subclass must explicitly extend the sealed class.
 * Permitted subclass must define a modifier: sealed, non-sealed or final.
 * Permitted subclass must belong to the same module to the sealed class.
 * Can't create anonymous inner class from a sealed interface or class.
 */
public class PatternMatcherChallenge {

  public static void main(String... doYourBest) {
    shoot(1l + "Type-1 Phaser");
    shoot(true);
    shoot(new StringBuffer("Plasma cannon").toString());
    shoot(new RuntimeException("Disruptor"));
  }

  static void shoot(Object object) {
    if (object instanceof StringBuffer) {
      System.out.println(((StringBuffer) object).toString() + ":buffer");
    } else if (object instanceof Comparable str) {
      System.out.println(str.equals(11 + "Type-1 Phaser"));
    } else if (object instanceof Serializable serializable) {
      System.out.println(serializable.toString() + ":serializable");
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
