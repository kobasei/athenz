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

//
// AWSInstanceInformation - AWSInstanceInformation - the information a booting
// EC2 instance must provide to ZTS to authenticate.
//

@JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS)
public class AWSAttestationData {
    public String document;
    public String signature;
    public String domain;
    public String service;
    public String csr;
    public String ssh;
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

    public AWSAttestationData setDocument(String document) {
        this.document = document;
        return this;
    }
    public String getDocument() {
        return document;
    }
    public AWSAttestationData setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }
    public AWSAttestationData setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public AWSAttestationData setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return service;
    }
    public AWSAttestationData setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return csr;
    }
    public AWSAttestationData setSsh(String ssh) {
        this.ssh = ssh;
        return this;
    }
    public String getSsh() {
        return ssh;
    }
    public AWSAttestationData setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public AWSAttestationData setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public AWSAttestationData setCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }
    public String getCloud() {
        return cloud;
    }
    public AWSAttestationData setSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }
    public String getSubnet() {
        return subnet;
    }
    public AWSAttestationData setAccess(String access) {
        this.access = access;
        return this;
    }
    public String getAccess() {
        return access;
    }
    public AWSAttestationData setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return secret;
    }
    public AWSAttestationData setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return token;
    }
    public AWSAttestationData setExpires(String expires) {
        this.expires = expires;
        return this;
    }
    public String getExpires() {
        return expires;
    }
    public AWSAttestationData setModified(String modified) {
        this.modified = modified;
        return this;
    }
    public String getModified() {
        return modified;
    }
    public AWSAttestationData setFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }
    public String getFlavor() {
        return flavor;
    }
}
