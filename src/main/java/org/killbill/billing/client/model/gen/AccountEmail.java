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


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.killbill.billing.client.model.gen.AuditLog;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class AccountEmail extends KillBillObject {

    private UUID accountId = null;

    private String email = null;



    public AccountEmail() {
    }

    public AccountEmail(final UUID accountId,
                     final String email,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.accountId = accountId;
        this.email = email;

    }


    public AccountEmail setAccountId(final UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public AccountEmail setEmail(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountEmail accountEmail = (AccountEmail) o;
        return Objects.equals(this.accountId, accountEmail.accountId) &&
        Objects.equals(this.email, accountEmail.email) &&
        Objects.equals(this.auditLogs, accountEmail.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId,
                            email,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountEmail {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

