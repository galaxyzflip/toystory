package toystory.common.member.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/api/hello")
    public List<String> Hello(){
        return Arrays.asList("서버서버", "뷰뷰");
    }
}
