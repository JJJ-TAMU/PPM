package io.agileintelligence.ppmtool.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

/**
 * MapValidationService
 *
 * @author JJJ
 * @date 7/19/21 6:08 PM
 * @email jiangjinjinyxt@gmail.com
 * @since 1.0.0
 */
@Service
public class MapValidationService {

    public ResponseEntity<?> MapValidationService(BindingResult result) {
        if (result.hasErrors()) {
            Map<String, String> map = new HashMap<>();
            for (var error : result.getFieldErrors()) {
                map.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
        }
        return null;
    }
}
