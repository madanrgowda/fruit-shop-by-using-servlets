package fruit_shop;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Dao;
import dto.Fruits_Shop;
@WebServlet("/View1.html")
public class view extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Dao A1=new Dao();
		List<Fruits_Shop> li=A1.fetchAll(); 
    
  	   req.setAttribute("li", li);
  	   req.getRequestDispatcher("success.jsp").forward(req, resp);

}
}