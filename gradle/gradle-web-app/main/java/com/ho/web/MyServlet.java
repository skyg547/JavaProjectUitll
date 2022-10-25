package com.ho.web;

@WebServlet("/sample")
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charsert=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head></head><body>hi</body></html>")
        
    }

    

}

