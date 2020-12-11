package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setCharacterEncoding("UTF-8"); // 브라우저 출력기 인코딩 utf-8로 설정
		response.setContentType("text/html; charset=utf-8");
	
		PrintWriter out = response.getWriter(); // 브라우저 출력기
		
		// 차태진 : chacha
		// 홍길동 : hong
		
		String loginId = request.getParameter("loginId");
		
		System.out.println(loginId);
		
		String name = "";
		
		if(loginId.equals("chacha")) {
			name = "차태진";
		} else if(loginId.equals("hong")) {
			name = "홍길동";
		}
		
		out.println("<h1 style='color:blue'>" + name + "님! 안녕하세요.</h1>");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
