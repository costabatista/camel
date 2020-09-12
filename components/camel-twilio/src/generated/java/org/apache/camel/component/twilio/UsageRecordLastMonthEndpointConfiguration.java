
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
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.usage.record.LastMonth
 */
@ApiParams(apiName = "usage-record-last-month", apiMethods = {@ApiMethod(methodName = "reader")})
@UriParams
@Configurer
public final class UsageRecordLastMonthEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "reader", description = "The SID of the Account that created the resources to read")
    private String pathAccountSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }
}
