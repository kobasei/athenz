/**
 * Copyright 2017 Yahoo Holdings, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.athenz.instance.provider.impl;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * AWSAttestationData - the information a booting
 * EC2 instance must provide to ZTS to authenticate.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class AWSAttestationData {
    public String document;
    public String signature;
    public String domain;
    public String service;
    public String name;
    public String account;
    public String cloud;
    public String subnet;
    public String access;
    public String secret;
    public String token;
    public String expires;
    public String modified;
    public String flavor;

    public void setDocument(String document) {
        this.document = document;
    }
    public String getDocument() {
        return document;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getSignature() {
        return signature;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getDomain() {
        return domain;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getService() {
        return service;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getAccount() {
        return account;
    }
    public void setCloud(String cloud) {
        this.cloud = cloud;
    }
    public String getCloud() {
        return cloud;
    }
    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }
    public String getSubnet() {
        return subnet;
    }
    public void setAccess(String access) {
        this.access = access;
    }
    public String getAccess() {
        return access;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }
    public String getSecret() {
        return secret;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }
    public void setExpires(String expires) {
        this.expires = expires;
    }
    public String getExpires() {
        return expires;
    }
    public void setModified(String modified) {
        this.modified = modified;
    }
    public String getModified() {
        return modified;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }
}
