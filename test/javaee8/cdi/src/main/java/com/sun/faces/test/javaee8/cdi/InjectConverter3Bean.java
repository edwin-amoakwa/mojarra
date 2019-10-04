/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.test.javaee8.cdi;

import javax.enterprise.context.RequestScoped;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="injectConverter3Bean")
@RequestScoped
public class InjectConverter3Bean {

    @FacesConverter(value = "injectConverter3", managed = true)
    @Inject
    private InjectConverter3 injectConverter3;
    
    private Long value;
    
    public Long getValue() {
        return value;
    }
    
    public void setValue(Long value) {
        this.value = value;
    }
    
    public String submit() {
        injectConverter3.getAsObject(null, null, null);
        return "";
    }
}