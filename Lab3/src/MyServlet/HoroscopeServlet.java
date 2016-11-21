package MyServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.MsgProcessor;

public class HoroscopeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("zodiac"));
		HttpSession session = req.getSession();
		String zodiac = req.getParameter("zodiac");
		String sex = req.getParameter("sex");
		String name = req.getParameter("name");
		boolean man;man = sex.equals("male")? true:false;
		
		String msg = MsgProcessor.getMessage(zodiac, man);
		
		session.setAttribute("name", name);
		session.setAttribute("sex", sex);
		session.setAttribute("msg", msg);
		resp.sendRedirect("./message.jsp");
	}
	
}
