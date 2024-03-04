package io.spring.security.api;
import io.spring.security.util.*;
import io.spring.security.config.MethodSecurity;
public class SecurityFilterChain {
    Interceptor interceptor;
    PostAuth postAuth;
    MethodSecurity methodSecurity;
}
