package lk.ijse.sms.app;

import io.spring.security.api.*;

public class SecurityConfig {
    SecurityFilterChain securityFilterChain;
    Decoder decoder;
//    Interceptor interceptor;  -> okay.Can not access security.util
//    MethodSecurity methodSecurity; ->okay.Can not access security.config
}
