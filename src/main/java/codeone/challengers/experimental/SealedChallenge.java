package codeone.challengers.experimental;

/**
 * The code below will compile when we change the following lines:
 *
 * A - sealed class Animal permits Dog, Cat { }
 *     class Cat extends Animal implements Mammal { }
 *
 * B - sealed interface Mammal permits Dog { }
 *     final class Cat { }
 *
 * C - sealed class Animal permits Dog, Cat { }
 *     final class extends Animal implements Mammal { }
 */
public class SealedChallenge {

 /* sealed class Animal permits Dog, Cat {}

  sealed interface Mammal permits Dog, Cat {}

  sealed class Dog extends Animal implements Mammal {}

  final class Cat extends Animal {}*/

}
