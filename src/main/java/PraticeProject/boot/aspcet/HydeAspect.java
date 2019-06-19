package PraticeProject.boot.aspcet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * spring aop + asprctJ
 * ��restful package銝�遙雿瘜� 
 * @author wistronits
 *
 */

@Aspect
@Component
public class HydeAspect {
	
	
	
	@Before("execution(* com..*.restful.*.*(..))")
    public void beforMethord(JoinPoint joinPoint){
		 System.out.println("method----Start");
		 
	 }
	
	
	@AfterReturning("execution(* com..*.restful.*.*(..))")
     public void returnMethord(JoinPoint joinPoint){
		 System.out.println("method----End");
		 
	 }
	
}
