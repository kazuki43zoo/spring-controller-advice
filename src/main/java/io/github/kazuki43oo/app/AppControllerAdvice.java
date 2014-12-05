package io.github.kazuki43oo.app;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@ControllerAdvice(basePackageClasses = AppControllerAdvice.class)
public class AppControllerAdvice extends WebMvcConfigurerAdapter {

    @ModelAttribute("appCommonMessage")
    public String commonMessage() {
        System.out.println("AppControllerAdvice#appCommonMessage() called.");
        return "Hello in AppControllerAdvice.";
    }

}
