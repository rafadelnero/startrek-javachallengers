package devoxx.challenges;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import jdk.incubator.concurrent.StructuredTaskScope;

public class StructureConcurrency {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    int result = test1() + test2();
    System.out.println("Result = " + result);
  }

  private static int test1() throws ExecutionException {
    try (var scope = new StructuredTaskScope.ShutdownOnSuccess<Integer>()) {
      Future<Integer> f1 = scope.fork(StructureConcurrency::get1);
      Future<Integer> f2 = scope.fork(StructureConcurrency::get2);
      scope.join();
      return scope.result();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private static int test2() {
    try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
      Future<Integer> f1 = scope.fork(StructureConcurrency::get1);
      Future<Integer> f2 = scope.fork(StructureConcurrency::get2);
      scope.join();
      return f1.resultNow() + f2.resultNow();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  private static int get1() throws InterruptedException {
    Thread.sleep(5000);
    return 1;
  }

  private static int get2() {
    return 2;
  }
}
