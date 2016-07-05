package learnzilla.rest;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnzillaRestController {

	private static final Logger log = Logger.getLogger(LearnzillaRestController.class.getName());

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> login(@RequestParam(value = "user") String username,
			@RequestParam(value = "password") String password) {

		log.info("login mit user: [" + username + "] and password [" + password + "]"); // TODO
																						// PW
																						// raus,
																						// return
																						// User
																						// Object!,

		// TODO service aufrufen -> userobject holen -> zurück geben ,
		// alternativ fehlerhandling.

		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> logout(@RequestParam(value = "user") String username) {

		log.info("logout mit user: [" + username + "]");

		// TODO logout methode aufrufen!

		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

	@RequestMapping(value = "/userinfos", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getUserInfos(@RequestParam(value = "userId") String userId) {

		log.info("get userinfos mit userId: [" + userId + "]");

		// TODO do it!

		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

	@RequestMapping(value = "/question", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getQuestion(@RequestParam(value = "userId") String userId) {

		log.info("get question mit userId: [" + userId + "]");

		// TODO do it!

		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}

	@RequestMapping(value = "/answer/{userid}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Boolean> checkAnswer(@RequestParam(value = "frageId") String frageId,
			@RequestParam(value = "antwortId") String antwortId) {

		log.info("check frageId: [" + frageId + "], antwortId: [" + antwortId + "]");

		// TODO merke dass user die frage beantwortet hat, und gebe zurück ob falsch/richtig!
		
		

		return new ResponseEntity<Boolean>(false, HttpStatus.OK);
	}

}