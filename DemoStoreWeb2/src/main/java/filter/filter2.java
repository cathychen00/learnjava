package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by 陈敬 on 2017/3/3.
 */
@WebFilter(filterName = "filter2",urlPatterns = "/*")
public class filter2 implements Filter {
    ServletContext context;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        context.log("filter2.doFilter()");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        context=config.getServletContext();
    }

}
