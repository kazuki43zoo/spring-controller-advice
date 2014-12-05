package io.github.kazuki43zoo.app1;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


@ControllerAdvice(basePackageClasses = io.github.kazuki43zoo.app1.App1ControllerAdvice.class)
public class App1ControllerAdvice {

    @ModelAttribute("app1CommonMessage")
    public String commonMessage() {
        System.out.println("App1ControllerAdvice#appCommonMessage() called.");
        return "Bye in App1ControllerAdvice.";
    }

}
