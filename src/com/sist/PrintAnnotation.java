package com.sist;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

/**
 *  Alt + Insert 오버로딩 할때
 *  Ctrl + b 자바 F3이랑 같은 기능
 * Created by sist on 2016-02-29.
 *      -annotation 의미: Java class 파일에 meta 정보를 기술하여
 *                        meta 정보를 프로그래밍에 활용하는 방식.
 *      -annotation 용도:
 *           -컴파일러에게 코드 작성 문법 에러 체크하도록 정보 제공.
 *               예)@Override
 *           -소프트웨어 개발 툴이 빌드, 배치 시 코드를 자동 생성하게 정보 제공.
 *           -실행(Run-Time)시 특정 기능 실행하도록 정보제공.
 *      -annotation target 종류
 *          -TYPE: class,interface,enum에서 사용가능.
 *          -FIELD: field에 사용가능.
 *          -METHOD: method에 사용가능.
 *
 *      -annotation 타입 정의
 *          -기본 엘리먼트 value
 *              -어노테이션 적용할 때 엘리먼트 이름 생략 가능.
 *          -두개 이상의 속성을 기술 할 때는 value=값 형태로 기술.
 *      -annotation 사용
 *
 *      -annotation 유지 정책
 *          -어노테이션 적용 코드가 유지되는 시점을 지정하는 것.
 *          -java.lang.annotation.RetentionPolicy 열거 상수로 정의.
 *              -SOURCE
 *                  -소스상에서만 어노테이션 정보를 유지함.
 *                  -소스 코드 분석할 때만 의미가 있음.
 *                  -바이트 코드 파일에는 정보가 남지 않음.
 *              -CLASS
 *                  -바이트 코드 파일까지 어노테이션 정보를 유지함.
 *                  -하지만 리플렉션을 이용해서 어노테이션 정보를 얻을 수는 없음.
 *              -RUNTIME
 *                  -바이트 코드 파일까지 어노테이션 정보를 유지함.
 *                  -리플렉션을 이용해서 런타임시에 어노테이션 정보를 얻을 수 있음.
 *       -Java Reflect란?
 *          -리플렉션(Reflection): 런타임에 클래스의 메타 정보를 얻는 기능.
 *
 *
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
