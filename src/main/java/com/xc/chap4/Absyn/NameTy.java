package com.xc.chap4.Absyn;
import com.xc.chap4.Symbol.Symbol;
public class NameTy extends Ty {
   public Symbol name;
   public NameTy(int p, Symbol n) {pos=p; name=n;}
}
