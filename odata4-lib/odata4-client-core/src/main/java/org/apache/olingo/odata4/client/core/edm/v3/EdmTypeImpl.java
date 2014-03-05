/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.olingo.odata4.client.core.edm.v3;

import org.apache.olingo.odata4.client.api.edm.xml.XMLMetadata;
import org.apache.olingo.odata4.client.core.edm.xml.AbstractEdmType;
import org.apache.olingo.odata4.client.core.edm.xml.v3.ComplexTypeImpl;
import org.apache.olingo.odata4.client.core.edm.xml.v3.EntityTypeImpl;
import org.apache.olingo.odata4.client.core.edm.xml.v3.EnumTypeImpl;

public class EdmTypeImpl extends AbstractEdmType {

  public EdmTypeImpl(final String typeExpression) {
    super(typeExpression);
  }

  public EdmTypeImpl(final XMLMetadata metadata, final String typeExpression) {
    super(metadata, typeExpression);
  }

  @Override
  public EnumTypeImpl getEnumType() {
    return (EnumTypeImpl) super.getEnumType();
  }

  @Override
  public ComplexTypeImpl getComplexType() {
    return (ComplexTypeImpl) super.getComplexType();
  }

  @Override
  public EntityTypeImpl getEntityType() {
    return (EntityTypeImpl) super.getEntityType();
  }

}