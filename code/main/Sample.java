package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    @RequestMapping("/show-sample")
    double showSample() {
        return 123.4567;
    }
}
