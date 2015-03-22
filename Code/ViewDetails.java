package ctrl;

import java.io.*;

import java.net.*;

import javax.servlet.*;

import javax.servlet.http.*;

public class ViewDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        

        try{

            out.println("<html>");

            out.println("<head>");

12

            out.println("<title>Servlet searchServlet</title>");  

            out.println("</head>");

            out.println("<body bgcolor='9BFDFC'>");

            out.println("<h1>COURSES AVAILABLE</h1>");

            out.println("<ul>");

            out.println("<a href='Djvt' ><li>Diploma in Java</li></a>");

            out.println("<br/>");

            out.println("<a href='Java' ><li>Learn Java in 2 Days</li></a>");

            out.println("<br/>");

            out.println("<a href='DotNet' ><li>Dot Net</li></a>");

            out.println("<br/>");

            out.println("<a href='Unix' ><li>Unix</li></a>");

            out.println("<br/>");

            out.println("<a href='Php' ><li>Php</li></a>");

            out.println("</ul>");

            out.println("<br/>");

            out.println("</body>");

            out.println("</html>");

            }

   finally{

       out.close();

   }

    }
