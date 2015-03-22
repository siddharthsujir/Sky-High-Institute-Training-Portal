package ctrl;

import java.io.*;

import java.net.*;

import javax.ejb.EJB;

import javax.servlet.*;

import javax.servlet.http.*;

import mode.LoginRemote;

public class LoginServlet extends HttpServlet {

    @EJB

10

    private LoginRemote loginBean;

   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        

        try {

           String u=request.getParameter("t1");

           String p=request.getParameter("t2");

           

       

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet logincontrol</title>");  

            out.println("</head>");

            out.println("<body bgcolor='9BFDFC'>");

            out.println("<h1> Welcome" + " " + " " + u + "!</h1>");

            out.println("</body>");

            out.println("</html>");

            String res= loginBean.Login_Table(u, p); 

            out.println(res);

            if (res.equals("Success"))

            {

                out.println("<ul>");

                out.println("<a href='Payment.html'><li> Payment</li></a>");

                out.println("<a href='ViewDetails'><li> Courses</li></a>");

                out.println("</ul>");     

            }

            else

            {

                out.println("invalid user name / password");

            }

                } 

        finally { 

            out.close();

        }

    } 
