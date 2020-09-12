
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
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.AvailablePhoneNumberCountry
 */
@ApiParams(apiName = "available-phone-number-country", apiMethods = {@ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
@UriParams
@Configurer
public final class AvailablePhoneNumberCountryEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "fetcher,reader", description = "The SID of the Account requesting the available phone number Country resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "fetcher", description = "The ISO country code of the country to fetch available phone number information about")
    private String pathCountryCode;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCountryCode() {
        return pathCountryCode;
    }

    public void setPathCountryCode(String pathCountryCode) {
        this.pathCountryCode = pathCountryCode;
    }
}
