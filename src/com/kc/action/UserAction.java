package com.kc.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String savePassword = request.getParameter("savePassword");

		Cookie un = new Cookie("un", name);
		Cookie pwd = new Cookie("pwd", password);
		Cookie savePwd = new Cookie("savePwd", savePassword);
		if (name.equals("admin") && password.equals("admin")) {// 鐧诲綍鎴愬姛
			if (savePassword.equals("1")) {// 淇濆瓨瀵嗙爜
				un.setMaxAge(24 * 60 * 60);// 淇濆瓨鏃堕棿
				pwd.setMaxAge(24 * 60 * 60);
				savePwd.setMaxAge(24 * 60 * 60);

				response.addCookie(un);
				response.addCookie(pwd);
				response.addCookie(savePwd);
			} else {// 涓嶄繚瀛樺瘑鐮�
				un.setMaxAge(0);// 淇濆瓨鏃堕棿
				pwd.setMaxAge(0);
				savePwd.setMaxAge(0);
				response.addCookie(un);
				response.addCookie(pwd);
				response.addCookie(savePwd);
			}
			System.out.println("1");
			String usernames = "";
			String passwords = "";
			String savePasswords = "1";
			Cookie[] c = request.getCookies();
			System.out.println("cookie");
			if (c != null) {
				for (Cookie cookie : c) {
					if (cookie.getName().equals("un")) {
						usernames = cookie.getValue();
						request.getSession().setAttribute("usernames",
								usernames);
					}
					if (cookie.getName().equals("pwd")) {
						passwords = cookie.getValue();
						request.getSession().setAttribute("passwords",
								passwords);
					}
					if (cookie.getName().equals("savePwd")) {
						savePasswords = cookie.getValue();
						request.getSession().setAttribute("savePasswords",
								savePasswords);
					}
				}
			}
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("2");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
