package main.java.br.com.ctm.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Email")
public class Email extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(mappedName="java:jboss/mail/ctm")
	private Session mailSession;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		try    {
            MimeMessage m = new MimeMessage(mailSession);
            Address from = new InternetAddress("diegoneuralo@gmail.com");
            Address[] to = new InternetAddress[] {new InternetAddress("talitaagapesjcampos@gmail.com") };

            m.setFrom(from);
            m.setRecipients(Message.RecipientType.TO, to);
            m.setSubject("JBoss AS 7 Mail");
            m.setSentDate(new java.util.Date());
            m.setContent("Mail sent from JBoss AS 7","text/plain");
            Transport.send(m);
            out.println("Mail sent!");
        }
        catch (javax.mail.MessagingException e)
        {
            e.printStackTrace();
            out.println("Error in Sending Mail: "+e);
        }
	}

}
