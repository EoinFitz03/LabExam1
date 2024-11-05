package ie.atu.labexam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.sym.error;

@RestControllerAdvice


public class GlobalErrorHandler {

    //not sure qhy the for loop will not work 

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> display (MethodArgumentNotValidException ex) {
        Map<String, String> errorList = new HashMap<>();

        for (FieldError : ex.getBindingResult().getFieldErrors()){
            String errorName = error.getField();
            errorList.put(errorName, errorMessage);
        }

        return ResponseEntity.status(400).body(errorList);

    }


}
