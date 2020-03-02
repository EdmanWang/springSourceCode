package com.wgx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author edmanwang
 **/
@RestController
@RequestMapping("/my/")
public class MyControl {
	@RequestMapping("hello")
	public void hello(HttpServletResponse response, String name) throws IOException {
		response.getWriter().println("hello edmanwang good man  111 ");
	}

	@RequestMapping("hello2")
	public void hello2(HttpServletResponse response, String name) throws IOException {
		response.getWriter().println("hello edmanwang good man  222 ");
	}
}
