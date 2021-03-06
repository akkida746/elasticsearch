/*
 * Licensed to ElasticSearch and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. ElasticSearch licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.action.admin.indices.mapping.delete;

import org.elasticsearch.cluster.ack.ClusterStateUpdateRequest;

/**
 * Cluster state update request that allows to delete a mapping
 */
public class DeleteMappingClusterStateUpdateRequest extends ClusterStateUpdateRequest<DeleteMappingClusterStateUpdateRequest> {

    private String[] indices;
    private String type;

    DeleteMappingClusterStateUpdateRequest() {

    }

    /**
     * Returns the indices the operation needs to be executed on
     */
    public String[] indices() {
        return indices;
    }

    /**
     * Sets the indices the operation needs to be executed on
     */
    public DeleteMappingClusterStateUpdateRequest indices(String[] indices) {
        this.indices = indices;
        return this;
    }

    /**
     * Returns the type to be removed
     */
    public String type() {
        return type;
    }

    /**
     * Sets the type to be removed
     */
    public DeleteMappingClusterStateUpdateRequest type(String type) {
        this.type = type;
        return this;
    }
}
