package com.techprimers.db.controller;

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
	public static void main(String[] args)
	{
		device d= new device();
		d.doGet();
	}
}

