package com.detectingdevice.device;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class device {
	public void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
if(request.getHeader("User-Agent").contains("Mobi")) {
	System.out.println("Mobile");

} else {
	System.out.println("Desktop");

}
}
}
