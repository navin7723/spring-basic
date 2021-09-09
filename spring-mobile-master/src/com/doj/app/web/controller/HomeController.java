/**
 * 
 */
package com.doj.app.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
    public String home(Device device) {
        if (device.isMobile()) {
            logger.info("Hello mobile user!");
            return "home-mobile";
        } else if (device.isTablet()) {
            logger.info("Hello tablet user!");
            return "home-tablet";
        } else {
            logger.info("Hello desktop user!");  
            return "home";
        }
    }
}
