package com.reliant;

import com.defiant.Spock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Executor {

  public static void main(String... doYourBest) throws NoSuchMethodException,
          InvocationTargetException, IllegalAccessException {
    new Spock().doh();

    Method method = Spock.class.getDeclaredMethod("attack", String.class);
    method.setAccessible(true);
    method.invoke(new Spock(), "reliant");
  }

}
