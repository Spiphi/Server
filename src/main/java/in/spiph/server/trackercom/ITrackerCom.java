/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.server.trackercom;

import in.spiph.info.Tracker;
import in.spiph.packets.iplookup.IpLookupResponsePacket;

/**
 *
 * @author Bennett.DenBleyker
 */
public interface ITrackerCom {
    public boolean sendIp(Tracker tracker);
    public IpLookupResponsePacket getIp(long id);
}
