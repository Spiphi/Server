/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.localclientcom;

import in.spiph.info.Client;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bennett.DenBleyker
 */
public interface IClientCom {
    Map<Long,Long> ID2PKEYMAP = new HashMap();
    
    public boolean authenticate(Client client);
}
