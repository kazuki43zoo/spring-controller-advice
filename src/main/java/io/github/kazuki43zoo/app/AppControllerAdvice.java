package io.github.kazuki43zoo.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;


@ControllerAdvice(basePackageClasses = io.github.kazuki43zoo.app.AppControllerAdvice.class)
public class AppControllerAdvice {

    @ModelAttribute("appCommonMessage")
    public String commonMessage() {
        System.out.println("AppControllerAdvice#appCommonMessage() called.");
        return "Hello in AppControllerAdvice.";
    }

}
