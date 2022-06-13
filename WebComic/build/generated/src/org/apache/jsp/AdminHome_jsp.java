package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"jumbotron text-center\">\n");
      out.write("            <h1 class=\"display-4\"><strong>Trang quản trị</strong></h1>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 pt-3\" >\n");
      out.write("                    <div class=\"card\" style=\"background-color:white;\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Tài khoản</h4>\n");
      out.write("                            <p class=\"card-text\">Quản lý tài khoản người dùng tại đây.</p>\n");
      out.write("                            <a href=\"#\" th:href=\"@{/admin/users}\" class=\"card-link btn btn-primary\">Chi tiết</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 pt-3\" >\n");
      out.write("                    <div class=\"card\" style=\"background-color:white;\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Thẻ loại</h4>\n");
      out.write("                            <p class=\"card-text\">Quản lý danh mục sản phẩm tại đây.</p>\n");
      out.write("                            <a href=\"#\" th:href=\"@{/admin/categories}\" class=\"card-link btn btn-primary\">Chi tiết</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 pt-3\" >\n");
      out.write("                    <div class=\"card\" style=\"background-color:white;\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"card-title\">Sản phẩm</h4>\n");
      out.write("                            <p class=\"card-text\">Quản lý tất cả sản phẩm tại đây.</p>\n");
      out.write("                            <a href=\"#\" th:href=\"@{/admin/products}\" class=\"card-link btn btn-primary\">Chi tiết</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
