/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2020 Equinix, Inc
 * Copyright 2014-2020 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.InvoiceItem;
import java.util.UUID;
import org.killbill.billing.client.model.InvoiceItems;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.collect.LinkedListMultimap;

import org.killbill.billing.client.Converter;
import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.client.RequestOptions.RequestOptionsBuilder;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class CreditApi {

    private final KillBillHttpClient httpClient;

    public CreditApi() {
        this(new KillBillHttpClient());
    }

    public CreditApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public InvoiceItems createCredits(final InvoiceItems body, final Map<String, String> pluginProperty, final RequestOptions inputOptions) throws KillBillClientException {
        return createCredits(body, Boolean.valueOf(false), pluginProperty, inputOptions);
    }

    public InvoiceItems createCredits(final InvoiceItems body, final Boolean autoCommit, final Map<String, String> pluginProperty, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCredits");

        final String uri = "/1.0/kb/credits";

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (autoCommit != null) {
            queryParams.put("autoCommit", String.valueOf(autoCommit));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, InvoiceItems.class, requestOptions);
    }

    public InvoiceItem getCredit(final UUID creditId, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(creditId, "Missing the required parameter 'creditId' when calling getCredit");

        final String uri = "/1.0/kb/credits/{creditId}"
          .replaceAll("\\{" + "creditId" + "\\}", creditId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, InvoiceItem.class, requestOptions);
    }

}
