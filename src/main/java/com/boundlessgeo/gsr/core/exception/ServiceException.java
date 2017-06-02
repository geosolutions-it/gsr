/* Copyright (c) 2013 - 2014 Boundless - http://boundlessgeo.com All rights reserved.
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package com.boundlessgeo.gsr.core.exception;

import com.boundlessgeo.gsr.core.GSRModel;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author Juan Marin - OpenGeo
 * 
 */

@XStreamAlias(value = "")
public class ServiceException implements GSRModel {

    private ServiceError error;

    public ServiceError getError() {
        return error;
    }

    public void setServiceError(ServiceError error) {
        this.error = error;
    }

    public ServiceException(ServiceError error) {
        this.error = error;
    }
}