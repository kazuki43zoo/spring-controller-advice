package io.github.kazuki43zoo.app1;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@ControllerAdvice(basePackageClasses = App1ControllerAdvice.class)
public class App1ControllerAdvice extends WebMvcConfigurerAdapter {

    @ModelAttribute("app1CommonMessage")
    public String commonMessage() {
        System.out.println("App1ControllerAdvice#appCommonMessage() called.");
        return "Bye in App1ControllerAdvice.";
    }

}
