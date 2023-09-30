package customers.aspect;

import customers.EmailSender;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Aspect
@Configuration
public class LogAdvice {

    @After("execution(* customers.EmailSender.sendEmail(..)) && args(email,message)")
    public void emailLogAdvice(JoinPoint joinPoint, String email, String message){
        System.out.println(LocalDateTime.now()+" method : "+joinPoint.getSignature().getName()+ " address="+ email + " message="+message);
    }
}
