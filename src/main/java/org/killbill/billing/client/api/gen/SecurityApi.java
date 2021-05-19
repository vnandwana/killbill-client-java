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


import org.killbill.billing.client.model.gen.RoleDefinition;
import org.killbill.billing.client.model.gen.Subject;
import org.killbill.billing.client.model.gen.UserRoles;
import org.killbill.billing.client.model.Strings;
import java.util.List;

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
public class SecurityApi {

    private final KillBillHttpClient httpClient;

    public SecurityApi() {
        this(new KillBillHttpClient());
    }

    public SecurityApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public RoleDefinition addRoleDefinition(final RoleDefinition body, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling addRoleDefinition");

        final String uri = "/1.0/kb/security/roles";


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, RoleDefinition.class, requestOptions);
    }

    public UserRoles addUserRoles(final UserRoles body, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling addUserRoles");

        final String uri = "/1.0/kb/security/users";


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, UserRoles.class, requestOptions);
    }

    public Strings getCurrentUserPermissions(final RequestOptions inputOptions) throws KillBillClientException {

        final String uri = "/1.0/kb/security/permissions";


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Strings.class, requestOptions);
    }

    public Subject getCurrentUserSubject(final RequestOptions inputOptions) throws KillBillClientException {

        final String uri = "/1.0/kb/security/subject";


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Subject.class, requestOptions);
    }

    public RoleDefinition getRoleDefinition(final String role, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(role, "Missing the required parameter 'role' when calling getRoleDefinition");

        final String uri = "/1.0/kb/security/roles/{role}"
          .replaceAll("\\{" + "role" + "\\}", role.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, RoleDefinition.class, requestOptions);
    }

    public UserRoles getUserRoles(final String username, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(username, "Missing the required parameter 'username' when calling getUserRoles");

        final String uri = "/1.0/kb/security/users/{username}/roles"
          .replaceAll("\\{" + "username" + "\\}", username.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, UserRoles.class, requestOptions);
    }


    public void invalidateUser(final String username, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(username, "Missing the required parameter 'username' when calling invalidateUser");

        final String uri = "/1.0/kb/security/users/{username}"
          .replaceAll("\\{" + "username" + "\\}", username.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void updateRoleDefinition(final RoleDefinition body, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling updateRoleDefinition");

        final String uri = "/1.0/kb/security/roles";


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

    public void updateUserPassword(final String username, final UserRoles body, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(username, "Missing the required parameter 'username' when calling updateUserPassword");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling updateUserPassword");

        final String uri = "/1.0/kb/security/users/{username}/password"
          .replaceAll("\\{" + "username" + "\\}", username.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

    public void updateUserRoles(final String username, final UserRoles body, final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(username, "Missing the required parameter 'username' when calling updateUserRoles");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling updateUserRoles");

        final String uri = "/1.0/kb/security/users/{username}/roles"
          .replaceAll("\\{" + "username" + "\\}", username.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

}
