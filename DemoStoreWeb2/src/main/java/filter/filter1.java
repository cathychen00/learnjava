package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by 陈敬 on 2017/3/3.
 */
@WebFilter(filterName = "filter1",initParams =@WebInitParam(name = "count",value = "100"),urlPatterns = "/*")
public class filter1 implements Filter {
    ServletContext context;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        context.log("filter1.doFilter()");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        context=config.getServletContext();
    }
}
