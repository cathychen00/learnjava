package filter;

import com.sun.javafx.scene.layout.region.Margins;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 陈敬 on 2017/3/2.
 */
public class counterFilter implements Filter {
    ServletContext context;
    int count;
    public void init(FilterConfig filterConfig) throws ServletException {
        context=filterConfig.getServletContext();
        String initCount=filterConfig.getInitParameter("count");
        count= Integer.valueOf(initCount);
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        context.log("===counterFilter do Filter====");
        count++;
        context.setAttribute("count",count);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {
    }
}
