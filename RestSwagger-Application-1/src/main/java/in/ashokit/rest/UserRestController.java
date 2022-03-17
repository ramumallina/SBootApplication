package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping(value="/user/{userId}")
	public String getName(@PathVariable Integer userId) {
		if (userId == 101) {
			return "RamuMallina";
		} else if (userId == 102) {
			return "Mallina RamaDevi";
		} else if (userId == 103) {
			return "DurgaAkka";
		} else if (userId == 104) {
			return "Manaswi";
		} else if (userId == 105) {
			return "Sravani";
		} else {
			return "User Not Found";
		}
	}
}
