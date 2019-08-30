package codeone.challengers;

public class WhatTheVar {
    public static void main(String... varGroup){
        System.out.println(new WhatTheVar().whatIstheVar());
    }
    public boolean whatIstheVar() {
        Var var = new Var();
        var cmdSpock = new Var(){};
        var cptKirk = new Var(){boolean isVar(){return true;}};
        var drMcCoy = (Var) null;
        drMcCoy = cptKirk;

        return cptKirk.isVar();
    }
    static class Var {}
}
