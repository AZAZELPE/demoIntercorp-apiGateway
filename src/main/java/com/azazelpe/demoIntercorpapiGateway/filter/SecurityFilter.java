package com.azazelpe.demoIntercorpapiGateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class SecurityFilter extends ZuulFilter {

    // Aqui debería ir validación de seguridad.
    // Se podría integrar con Auth0.com y trabajar directamente validando TOKENS JWT

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
