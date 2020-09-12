
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.call.Notification
 */
@ApiParams(apiName = "call-notification", apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
@UriParams
@Configurer
public final class CallNotificationEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "fetcher,reader", description = "The SID of the Account that created the resource to fetch")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "fetcher,reader", description = "The Call SID of the resource to fetch")
    private String pathCallSid;
    @UriParam
    @ApiParam(apiMethods = "fetcher", description = "The unique string that identifies the resource")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
