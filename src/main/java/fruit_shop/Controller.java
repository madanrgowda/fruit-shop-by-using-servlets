package fruit_shop;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.Dao;
import dto.Fruits_Shop;
@WebServlet("/shopping")
public class Controller  extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Fruits_Shop a=new Fruits_Shop();   
	 a.setName(req.getParameter("name"));
	    a.setNumber(Long.parseLong(req.getParameter("mobile")));
	    int appleQty = a.setAppleQty(Integer.parseInt(req.getParameter("appleQty")));
	    int a1=appleQty*100;
	    int orangeQty = a.setOrangeQty(Integer.parseInt(req.getParameter("orangeQty")));
	    int o1=orangeQty*60;
	    int pineappleQty = a.setPineappleQty(Integer.parseInt(req.getParameter("pineappleQty")));
	    int p1=pineappleQty*50;
	    int guavaQty = a.setGuavaQty(Integer.parseInt(req.getParameter("guavaQty")));
	    int g1=guavaQty*60;
	    int grapesQty = a.setGrapesQty(Integer.parseInt(req.getParameter("grapesQty")));
	    int g2=grapesQty*40;
	    int tot=a1+o1+p1+g1+g2;
	    a.setTotal(tot);
	    
	    Dao aa=new Dao();
	    aa.add(a);
	    resp.sendRedirect("View1.html");

}
 
}

