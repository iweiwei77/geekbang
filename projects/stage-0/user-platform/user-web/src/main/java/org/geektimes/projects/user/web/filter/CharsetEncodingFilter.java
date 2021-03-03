package org.geektimes.projects.user.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * encoding Filter
 */
public class CharsetEncodingFilter implements Filter {

    private String encoding = null;

    private ServletContext servletContext;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");
        this.servletContext = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpRequest = (HttpServletRequest) request;
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpRequest.setCharacterEncoding(encoding);
            httpResponse.setCharacterEncoding(encoding);
            servletContext.log("Set current encoding :" + encoding);
            // CharsetEncodingFilter -> FrontControllerServlet -> forward -> index.jsp
        }

        // do filter chain
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
