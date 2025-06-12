package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PrimeController {

    /**
     * REST API endpoint to check if a number is prime.
   
     *
     * @param number - the number to check
     * @return JSON response with number, method used, and result
     */
    @GetMapping("/is-prime")
    public Map<String, Object> isPrime(@RequestParam int number) {
        Map<String, Object> result = new HashMap<>();
        result.put("number", number);
        result.put("method", "fast");
        result.put("isPrime", isPrimeFast(number));
        return result;
    }

    /**
     * Efficient method to check if a number is prime using 6k ± 1 optimization.
     *
     * @param num - the number to check
     * @return true if prime, false otherwise
     */
    private boolean isPrimeFast(int num) {
        if (num <= 1) return false;         // 0 and 1 are not prime
        if (num <= 3) return true;          // 2 and 3 are prime
        if (num % 2 == 0 || num % 3 == 0)   // Eliminate multiples of 2 and 3
            return false;

        // Only check numbers of form 6k ± 1 up to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
