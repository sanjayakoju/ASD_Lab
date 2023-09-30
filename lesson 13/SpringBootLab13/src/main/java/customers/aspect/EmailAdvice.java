package customers.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Aspect
@Configuration
public class EmailAdvice {

    @After("execution(* customers.EmailSender.sendEmail(..))")
    public void sendEmailMethod(JoinPoint joinPoint) {
        System.out.println(LocalDateTime.now() + "method = sendEmailMethod");
    }
}
