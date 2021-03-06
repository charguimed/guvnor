/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.client.explorer.navigation.modules;

import org.drools.guvnor.client.explorer.ClientFactory;
import org.drools.guvnor.client.explorer.ModuleEditorPlace;
import org.drools.guvnor.client.rpc.Module;

import com.google.gwt.user.client.ui.IsTreeItem;

public class ModuleTreeSelectableItem extends ModuleTreeItem {

    public ModuleTreeSelectableItem(ClientFactory clientFactory,
                                    IsTreeItem treeItem,
                                    Module packageConfigData) {
        super( clientFactory,
               treeItem );
        this.view.setRootUserObject( new ModuleEditorPlace( packageConfigData.getUuid() ) );
    }

}
