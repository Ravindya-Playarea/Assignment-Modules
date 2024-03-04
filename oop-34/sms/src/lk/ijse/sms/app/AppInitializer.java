package lk.ijse.sms.app;

import com.netflix.ribbon.api.*;
import com.netflix.zuul.service.*;

public class AppInitializer {
    RibbonService ribbonService;
    RibbonGateway ribbonGateway;
    ApiGateway apiGateway;
    RandomService randomService;
    //RibbonConfig ribbonConfig; -> okay.Can not access ribbon.config
    //Utility utility; -> okay.Can not access zuul.util
}
