package com.jameson.oaktree.blogserver.aspect;

import com.jameson.oaktree.blogserver.vo.RequestLog;
import com.jameson.oaktree.common.base.BaseController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangshu
 * @date 2022-01-17 17:43
 */


@Aspect
@Component
public class LogAspect extends BaseController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    
    @Pointcut("execution(* com.jameson.oaktree.blogserver.controller.*.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        HttpServletRequest request = getRequest();
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();
        String classMethod = String.format("%s.%s", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        logger.info("Request : {}", new RequestLog(url, ip, classMethod, args));
    }

    @AfterReturning(pointcut = "log()", returning = "result")
    public void doAfterReturn(Object result) {
        logger.info("Result : {}", result);
    }

}
