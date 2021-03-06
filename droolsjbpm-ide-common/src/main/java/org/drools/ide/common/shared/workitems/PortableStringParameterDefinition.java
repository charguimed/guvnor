/*
 * Copyright 2011 JBoss Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.drools.ide.common.shared.workitems;

/**
 * A String parameter
 */
public class PortableStringParameterDefinition extends PortableParameterDefinition
    implements
    HasValue<String>,
    HasBinding {

    private static final long serialVersionUID = 540L;

    private String            binding;

    private String            value;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBinding() {
        return this.binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String asString() {
        if ( isBound() ) {
            return this.getBinding();
        }
        if ( this.value == null ) {
            return "null";
        }
        return "\"" + value + "\"";
    }

    @Override
    public String getClassName() {
        return String.class.getName();
    }

    public boolean isBound() {
        return (this.getBinding() != null && !"".equals( this.getBinding() ));
    }

}
