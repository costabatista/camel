
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
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.ShortCode
 */
@ApiParams(apiName = "short-code", apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "updater")})
@UriParams
@Configurer
public final class ShortCodeEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "fetcher,reader,updater", description = "The SID of the Account that created the resource(s) to fetch")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "fetcher,updater", description = "The unique string that identifies this resource")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
