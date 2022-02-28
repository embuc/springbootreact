/*
 * © Copyright Tactel AB 2022
 * All copyrights in this software are created and owned
 * by Tactel AB. This software, or related intellectual
 * property, may under no circumstances be used, distributed
 * or modified without written authorization from Tactel AB.
 * This copyright notice may not be removed or modified and
 * shall be displayed in all materials that include the
 * software or portions of such.
 *
 * Created on 28 Feb 2022.
 */
package se.emirb.springbootreact.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple example Rest Controller.
 *
 * @author Emir Bucalovic (embuc)
 * @since 28 Feb 2022
 */
@RestController
public class HelloController {

	/**
	 * Hello world endpoint.
	 *
	 * @return the hello world message
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Greetings from Spring Boot!";
	}
}
