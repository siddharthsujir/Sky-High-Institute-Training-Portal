package ctrl;

import java.io.*;

import java.net.*;

import javax.ejb.EJB;

import javax.servlet.*;

import javax.servlet.http.*;

import mode.LoginRemote;

public class PaymentServlet extends HttpServlet {

    @EJB

    private LoginRemote loginBean;

   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)

    throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        try {

           String cno=request.getParameter("c_no");

            String amt=request.getParameter("amount");

            int amt1=Integer.parseInt(amt);

            String cvv=request.getParameter("cvv");

            String name=request.getParameter("un");

            String tdate=request.getParameter("date");

            String xyz= loginBean.PaymentBean(name,amt1);

            out.println(xyz);

        } finally { 

            out.close();

        }

    }
