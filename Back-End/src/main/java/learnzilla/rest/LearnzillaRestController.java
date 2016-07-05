package learnzilla.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnzillaRestController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> login(@RequestParam(value="user") String user) {
        
		   HttpHeaders responseHeaders = new HttpHeaders();
		   responseHeaders.set("MyResponseHeader", "MyValue");
		   return new ResponseEntity<String>("Hello World", responseHeaders, HttpStatus.CREATED);
    }
}