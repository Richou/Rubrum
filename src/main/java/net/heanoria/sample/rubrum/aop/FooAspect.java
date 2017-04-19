package net.heanoria.sample.rubrum.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FooAspect {

    @Around("execution(* *.doGetHelloSomeone(..))")
    public Object beforeDoGetSomeOne(ProceedingJoinPoint pjp) throws Throwable {
        Logger logger = LoggerFactory.getLogger(FooAspect.class);
        logger.info("Passing by");
        Object[] args = pjp.getArgs();
        if (args != null && args.length == 1 && args[0] instanceof String && "toto".equals(args[0])) {
            return pjp.proceed(new String[]{"tata"});
        }
        return pjp.proceed(args);
    }
}
