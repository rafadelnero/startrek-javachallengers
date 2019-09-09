package codeone.challengers;
//JDK 11 Challenge (still drafting)
public class WrathOfLambdaVar {
    public static void main(String... varGroup){
        System.out.println(new WrathOfLambdaVar().localVars());
    }

    private int localVars(){
        ITest test = (String s1, String s2) -> s1 + s2;
        ITest test1 = (s1, final s2) -> s1 + s2;
        ITest test2 = (var s1, final var s2) -> s1 + s2;
        // look at class since var is var and the interface has a String type
        //reflect on the type
        test2.test("x",null);
//        ITest test3 = (var s1, @Nullable var s2) -> s1 + s2;
//        test3.test("x",null);
        // not good
        //ITest test4 = (var s1, s2) -> s1 + s2;
        //ITest test5 = (var s1, String s2) -> s1 + s2;
        ITest2 test6 = s1 -> s1.toUpperCase(); // this one is okay
        //ITest2 test7 = var s1 -> s1.toUpperCase();
        return 0;
    }
    @FunctionalInterface
    interface ITest{
        String test(String s1, String s2);
    }
    @FunctionalInterface
    interface ITest2{
        String test2(String s1);
    }
}
