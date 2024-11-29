package com.github.git_leon.alphavantage.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;

@Aspect
@Component
public class LoggingConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingConfig.class);

    // AOP expression to intercept all methods in the specified package and subpackages
    @Around("execution(* com.github.curriculeon..*(..))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        String arguments = Arrays.toString(proceedingJoinPoint.getArgs());

        StopWatch stopWatch = new StopWatch();
        Object result;

        // Measure method execution time
        LOGGER.info("Attempting to invoke `{}.{}({})`...", className, methodName, arguments);
        stopWatch.start();
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            LOGGER.error("Exception in `{}.{}({})`: {}", className, methodName, arguments, throwable.getMessage(), throwable);
            throw throwable; // Rethrow to preserve original behavior
        } finally {
            stopWatch.stop();
        }

        long elapsedTime = stopWatch.getTotalTimeMillis();
        LOGGER.info("`{}.{}({})` resulted in `{}` :: executed in {} ms", className, methodName, arguments, result, elapsedTime);
        return result;
    }
}
