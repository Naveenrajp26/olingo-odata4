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

package org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types;

import org.apache.olingo.ext.proxy.api.annotations.AnnotationsForProperty;
import org.apache.olingo.ext.proxy.api.annotations.AnnotationsForNavigationProperty;
import org.apache.olingo.ext.proxy.api.annotations.Namespace;
import org.apache.olingo.ext.proxy.api.annotations.ComplexType;
import org.apache.olingo.ext.proxy.api.annotations.EntitySet;
import org.apache.olingo.ext.proxy.api.annotations.Property;
import org.apache.olingo.ext.proxy.api.annotations.NavigationProperty;
import org.apache.olingo.ext.proxy.api.AbstractOpenType;
import org.apache.olingo.ext.proxy.api.AbstractEntitySet;
import org.apache.olingo.ext.proxy.api.Annotatable;
import org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.*;
import org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.*;

import org.apache.olingo.commons.api.edm.geo.Geospatial;
import org.apache.olingo.commons.api.edm.geo.GeospatialCollection;
import org.apache.olingo.commons.api.edm.geo.LineString;
import org.apache.olingo.commons.api.edm.geo.MultiLineString;
import org.apache.olingo.commons.api.edm.geo.MultiPoint;
import org.apache.olingo.commons.api.edm.geo.MultiPolygon;
import org.apache.olingo.commons.api.edm.geo.Point;
import org.apache.olingo.commons.api.edm.geo.Polygon;
import java.math.BigDecimal;
import java.net.URI;
import java.util.UUID;
import java.util.Collection;
import java.util.Calendar;
import javax.xml.datatype.Duration;


@org.apache.olingo.ext.proxy.api.annotations.Namespace("Microsoft.Test.OData.Services.AstoriaDefaultService")
@org.apache.olingo.ext.proxy.api.annotations.ComplexType(name = "ContactDetails")
public interface ContactDetails 
    extends java.io.Serializable {


    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "EmailBag", type = "Edm.String", nullable = false)
    java.util.Collection<java.lang.String> getEmailBag();

    void setEmailBag(java.util.Collection<java.lang.String> _emailBag);

    

    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "AlternativeNames", type = "Edm.String", nullable = false)
    java.util.Collection<java.lang.String> getAlternativeNames();

    void setAlternativeNames(java.util.Collection<java.lang.String> _alternativeNames);

    

    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "ContactAlias", type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Aliases", nullable = true)
    org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Aliases getContactAlias();

    void setContactAlias(org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Aliases _contactAlias);

        

    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "HomePhone", type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone", nullable = true)
    org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone getHomePhone();

    void setHomePhone(org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone _homePhone);

        

    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "WorkPhone", type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone", nullable = true)
    org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone getWorkPhone();

    void setWorkPhone(org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone _workPhone);

        

    @org.apache.olingo.ext.proxy.api.annotations.Property(name = "MobilePhoneBag", type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone", nullable = false)
    java.util.Collection<org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone> getMobilePhoneBag();

    void setMobilePhoneBag(java.util.Collection<org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone> _mobilePhoneBag);

        

    ComplexFactory factory();

    interface ComplexFactory {
         @org.apache.olingo.ext.proxy.api.annotations.Property(name = "ContactAlias",
                   type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Aliases")
         org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Aliases newContactAlias();

         @org.apache.olingo.ext.proxy.api.annotations.Property(name = "HomePhone",
                   type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone")
         org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone newHomePhone();

         @org.apache.olingo.ext.proxy.api.annotations.Property(name = "WorkPhone",
                   type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone")
         org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone newWorkPhone();

         @org.apache.olingo.ext.proxy.api.annotations.Property(name = "MobilePhoneBag",
                   type = "Microsoft.Test.OData.Services.AstoriaDefaultService.Phone")
         org.apache.olingo.fit.proxy.v3.staticservice.microsoft.test.odata.services.astoriadefaultservice.types.Phone newMobilePhoneBag();

    }
}