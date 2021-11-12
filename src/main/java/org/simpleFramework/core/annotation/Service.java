package org.simpleFramework.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: simpleframework
 * @Package: org.simpleFramework.core.annotation
 * @ClassName: Service
 * @Author: albert.fang
 * @Description:
 * @Date: 2021/11/11 18:52
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {
}
