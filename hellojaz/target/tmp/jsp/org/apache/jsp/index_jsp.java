package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Date data = new Date(); 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        2 + 2 =");
      out.print( 2+2 );
      out.write("<br>\n");
      out.write("        ala ma kota <br>\n");
      out.write("        \n");
      out.write("        ");
      out.print( new java.util.Date() );
      out.write("<br>\n");
      out.write("        Server: ");
      out.print( application.getServerInfo() );
      out.write("<br><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
for(int i=0; i<10; i++) {
        	for(int j=0; j<15; j++){
      out.write("\n");
      out.write("        *\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
} 
      out.write("\n");
      out.write("        \n");
      out.write("        Imie podane w formularzu: ");
      out.print( session.getAttribute('name') );
      out.write("<br>\n");
      out.write("         \n");
      out.write("        ");
      out.write(" \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        ");
      out.print(new Date() );
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("<br>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        Strona dziala od: ");
      out.print( data );
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
