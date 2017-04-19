package net.heanoria.sample.rubrum.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InOutLoggerAspect {

    @Around("@annotation(net.heanoria.sample.rubrum.aop.InOutLogger)")
    public Object loggingArround(ProceedingJoinPoint pjp) throws Throwable {
        Logger logger = LoggerFactory.getLogger(pjp.getTarget().getClass());
        logger.info("Entering method " + pjp.getSignature().getName() + "()");
        Object result = pjp.proceed();
        logger.info("Exiting method " + pjp.getSignature().getName());
        return result;
    }
}
