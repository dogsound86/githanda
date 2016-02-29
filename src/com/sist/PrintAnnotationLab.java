package com.sist;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by sist on 2016-02-29.
 */
public class PrintAnnotationLab {

    public static void main(String[] args){
        //MethodUseAnnotation 클래스로부터 메서드 정보를 얻음.
        Method[] methods=MethodUseAnnotation.class.getDeclaredMethods();

        //Method 객체를 하나씩 처리함.
        for(Method method : methods){
            //PrintAnnotation가 적용되었는지 확인.
            if(method.isAnnotationPresent(PrintAnnotation.class)){
                //PrintAnnotation 객체 얻기
                PrintAnnotation printAnnotation=method.getAnnotation(PrintAnnotation.class);
                //메소드 이름 출력
                System.out.println("[ "+method.getName()+"] ");
                //구분선 출력
                for(int i=0;i<printAnnotation.number();i++){
                    System.out.print(printAnnotation.value());
                }
                System.out.println();

                try
                {
                    method.invoke(new MethodUseAnnotation());
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
