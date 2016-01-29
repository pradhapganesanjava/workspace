package com.pg.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

import com.pg.ws.soap.stub.math.MapTableService;
import com.pg.ws.soap.stub.math.MapTableServiceImplService;

@WebServlet(urlPatterns = "/hello", loadOnStartup = 1, name = "helloservlet")
public class HelloworldServlet extends HttpServlet {

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("Init configured ");
		super.init(arg0);
	}

	/*@WebServiceRef(type=MapTableService.class)
	static MapTableServiceImplService mapTableServiceSEI;*/
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
			IOException {

		MapTableServiceImplService mapTableSEI = new MapTableServiceImplService();
		MapTableService mapTableService =  mapTableSEI.getMapTableServiceImplPort();
		//MapTableService mapTableService =  mapTableServiceSEI.getMapTableServiceImplPort();
		System.out.println(mapTableService.getSquare(12));
		
		PrintWriter pw = res.getWriter();
		pw.println("Hellooooo 22 ");
		pw.close();

	}

}
