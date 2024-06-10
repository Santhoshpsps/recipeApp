package com.psps.recipe.controller;

import com.psps.recipe.exceptions.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NotFoundException.class)
    public ModelAndView handle404(Exception exception) {
        log.error("Handling Not Found Exception!! ");
        log.error(exception.getMessage());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("404Error");
        modelAndView.addObject("exception", exception);
        return modelAndView;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(NumberFormatException.class)
    public ModelAndView handleBadRequest() {
        log.error("Handling Number Format Exception !!  ");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("BadRequestError");

        return modelAndView;
    }
}
