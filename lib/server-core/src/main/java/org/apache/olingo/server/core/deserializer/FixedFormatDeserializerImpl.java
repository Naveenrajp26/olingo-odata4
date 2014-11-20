/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.server.core.deserializer;

import java.util.List;

import org.apache.olingo.commons.api.http.HttpHeader;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.batch.BatchException;
import org.apache.olingo.server.api.deserializer.FixedFormatDeserializer;
import org.apache.olingo.server.api.deserializer.batch.BatchRequestPart;
import org.apache.olingo.server.core.deserializer.batch.BatchParser;

public class FixedFormatDeserializerImpl implements FixedFormatDeserializer {

  // TODO: Deserializer
  @Override
  public List<BatchRequestPart> parseBatchRequest(ODataRequest request, boolean isStrict) throws BatchException {
    BatchParser parser = new BatchParser();
    return parser.parseBatchRequest(request.getBody(), getContentType(request), request.getRawBaseUri(),
        request.getRawServiceResolutionUri(), isStrict);
  }

  private String getContentType(ODataRequest request) {
    return request.getHeader(HttpHeader.CONTENT_TYPE);
  }
}