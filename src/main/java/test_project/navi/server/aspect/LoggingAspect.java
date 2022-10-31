package test_project.navi.server.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* test_project.navi.server.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
            String className = methodSignature.getClass().getSimpleName();
            String methodName = methodSignature.getName();
                System.out.println("Begin of "+methodName+" in class "+className);

            Object targetMethodResult = proceedingJoinPoint.proceed();

                System.out.println("End of "+methodName+" in class "+className);
        return targetMethodResult;
    }

}
