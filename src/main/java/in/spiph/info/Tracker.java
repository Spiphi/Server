/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.spiph.info;

import in.spiph.packets.packetmanager.IPacketManager;
import java.net.URL;

/**
 *
 * @author Bennett.DenBleyker
 */
public class Tracker {

    final URL ip;
    final IPacketManager pman;

    public Tracker(URL ip, IPacketManager pman) {
        this.ip = ip;
        this.pman = pman;
    }

}
