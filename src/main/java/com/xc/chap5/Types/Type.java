package com.xc.chap5.Types;

public abstract class Type {
   public Type actual() {return this;}
         
   public boolean coerceTo(Type t) {return false;}
}

