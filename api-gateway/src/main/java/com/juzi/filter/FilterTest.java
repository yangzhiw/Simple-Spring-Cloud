package com.juzi.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yzw on 2016/8/25 0025.
 */
public class FilterTest  extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(FilterTest.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Object accessToken = request.getParameter("c");
        if(accessToken == null) {
            log.warn("c is empty");
            ctx.setSendZuulResponse(false);   //不对其进行路由
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("c ok");
        return null;
    }
}
