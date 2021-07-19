package io.agileintelligence.ppmtool.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ProjectIdException
 *
 * @author JJJ
 * @date 7/19/21 5:42 PM
 * @email jiangjinjinyxt@gmail.com
 * @since 1.0.0
 */

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectIdException extends RuntimeException{
    public ProjectIdException(String message) {
        super(message);
    }
}
