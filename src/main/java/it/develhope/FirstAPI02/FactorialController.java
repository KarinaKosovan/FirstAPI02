package it.develhope.FirstAPI02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    //Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n.
    // For example factorial of 6 is 6*5*4*3*2*1 which is 720.
    @GetMapping("/factorial/{n}")
    public int factorial(@PathVariable int n) {
        int factorial = 1;
        if (n < 0) {
            factorial = 0;
        } else {
            for (int i = 0; i < n; ++i) {
                factorial *= (i+1);
            }
        }
        return factorial;
    }
}
