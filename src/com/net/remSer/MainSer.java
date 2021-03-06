/*
 * Copyright 2017 Neel Patel.
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
package com.net.remSer;

import com.dataBean.IntDataBean;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Neel Patel
 */
public class MainSer extends UnicastRemoteObject implements IntMainSer{
    private final MainSerHandle mh;
    
    public MainSer(MainSerHandle mh)throws RemoteException{
        this.mh=mh;
    }

    @Override
    public String getKey(String pcName) throws RemoteException {
        return mh.getKey(pcName);
    }

    @Override
    public boolean log(IntDataBean db,String key) throws RemoteException {
        return mh.log(db);
    }
    
}
