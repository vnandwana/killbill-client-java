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
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.client.model.gen.NodeCommandProperty;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class NodeCommand {

    private Boolean isSystemCommandType = null;

    private String nodeCommandType = null;

    private List<NodeCommandProperty> nodeCommandProperties = null;


    public NodeCommand() {
    }

    public NodeCommand(final Boolean isSystemCommandType,
                     final String nodeCommandType,
                     final List<NodeCommandProperty> nodeCommandProperties) {
        this.isSystemCommandType = isSystemCommandType;
        this.nodeCommandType = nodeCommandType;
        this.nodeCommandProperties = nodeCommandProperties;

    }


    public NodeCommand setIsSystemCommandType(final Boolean isSystemCommandType) {
        this.isSystemCommandType = isSystemCommandType;
        return this;
    }

    @JsonProperty(value="isSystemCommandType")
    public Boolean isSystemCommandType() {
        return isSystemCommandType;
    }

    public NodeCommand setNodeCommandType(final String nodeCommandType) {
        this.nodeCommandType = nodeCommandType;
        return this;
    }

    public String getNodeCommandType() {
        return nodeCommandType;
    }

    public NodeCommand setNodeCommandProperties(final List<NodeCommandProperty> nodeCommandProperties) {
        this.nodeCommandProperties = nodeCommandProperties;
        return this;
    }

    public NodeCommand addNodeCommandPropertiesItem(final NodeCommandProperty nodeCommandPropertiesItem) {
        if (this.nodeCommandProperties == null) {
            this.nodeCommandProperties = new ArrayList<NodeCommandProperty>();
        }
        this.nodeCommandProperties.add(nodeCommandPropertiesItem);
        return this;
    }

    public List<NodeCommandProperty> getNodeCommandProperties() {
        return nodeCommandProperties;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeCommand nodeCommand = (NodeCommand) o;
        return Objects.equals(this.isSystemCommandType, nodeCommand.isSystemCommandType) &&
        Objects.equals(this.nodeCommandType, nodeCommand.nodeCommandType) &&
        Objects.equals(this.nodeCommandProperties, nodeCommand.nodeCommandProperties);

    }

    @Override
    public int hashCode() {
        return Objects.hash(isSystemCommandType,
                            nodeCommandType,
                            nodeCommandProperties);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeCommand {\n");
        
        sb.append("    isSystemCommandType: ").append(toIndentedString(isSystemCommandType)).append("\n");
        sb.append("    nodeCommandType: ").append(toIndentedString(nodeCommandType)).append("\n");
        sb.append("    nodeCommandProperties: ").append(toIndentedString(nodeCommandProperties)).append("\n");
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

