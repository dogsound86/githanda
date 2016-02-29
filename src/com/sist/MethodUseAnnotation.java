package com.sist;

/**
 * Created by sist on 2016-02-29.
 */
public class MethodUseAnnotation {

    @PrintAnnotation
    public void metthodName1(){
        System.out.println("어노테이션 적용 메서드1 내용");
    }
    @PrintAnnotation("*")
    public void metthodName2(){
        System.out.println("어노테이션 적용 메서드2 내용");
    }
    @PrintAnnotation(value="$,number=100")
    public void metthodName3(){
        System.out.println("어노테이션 적용 메서드3 내용");
    }





    @Override
    public String toString() {
        return super.toString();
    }
}
