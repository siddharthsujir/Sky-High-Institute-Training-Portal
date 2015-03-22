package ctrl;

import java.io.*;

import java.net.*;

import javax.ejb.EJB;

import javax.servlet.*;

import javax.servlet.http.*;

import mode.RegistrationRemote;

public class RegisterServlet extends HttpServlet {

11

    @EJB

    private RegistrationRemote registrationBean;

   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {

       response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        

        try {

           String n=request.getParameter("t1");

           String p=request.getParameter("t2");

           String g=request.getParameter("g1");

           String q=request.getParameter("d1");

           String c=request.getParameter("d2");

           String m=request.getParameter("dd");

           //String mb=request.getParameter("de");

           

          int py=0; //Integer.parseInt(mb);

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet newusercontrol</title>");  

            out.println("</head>");

            out.println("<body bgcolor='9BFDFC'>");

            out.println("<h1>Congratulations");

            out.println("<i>" +  n + "</i> ");

            out.println("! You have been registered successfully.</h1>");

            out.println("</body>");

            out.println("</html>");

      out.println(registrationBean.RegUser(n,p,g,q,c,py,m));

      out.println("<a href='LoginFormServlet'> click here to Login</a>");

        } finally { 

            out.close();

        }

    }

