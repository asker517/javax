/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javax.test.net;

import me.panpf.javax.net.Netx;
import me.panpf.javax.util.Regexx;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class NetxTest {

    @Test
    public void testIpType() {
        Assert.assertTrue(Netx.isIPV4("8.8.8.8"));
        Assert.assertFalse(Netx.isIPV4("天天向上"));

        Assert.assertTrue(Netx.isIPV6("11:11:e:1EEE:11:11:200.200.200.200"));
        Assert.assertTrue(Netx.isIPV6("5e:0:0:0:0:0:5668:eeee"));
        Assert.assertTrue(Netx.isIPV6("8.8.8.8"));
        Assert.assertFalse(Netx.isIPV6("天天向上"));

        Assert.assertTrue(Netx.isMacAddress("58:E8:76:83:A2:C7"));
        Assert.assertTrue(Netx.isMacAddress("58-E8-76-83-A2-C7"));
        Assert.assertTrue(Netx.isMacAddress("58:e8:76:83:a2:c7"));
        Assert.assertTrue(Netx.isMacAddress("58-e8-76-83-a2-c7"));
        Assert.assertFalse(Netx.isMacAddress("58/E8:76:83:A2:C7"));
        Assert.assertFalse(Netx.isMacAddress("天天向上"));
    }

    @Test
    public void testLocalIP() {
        String ip = Netx.getLocalIPAddress();
        if (ip != null) {
            Assert.assertTrue(Netx.isIPV4(ip) || Netx.isIPV6(ip));
        }

        ip = Netx.getLocalIPAddress("8.8.8.8");
        Assert.assertNotNull(ip);
        Assert.assertTrue(Netx.isIPV4(ip) || Netx.isIPV6(ip));
    }

    @Test
    public void testLocalIPV4() {
        String ip = Netx.getLocalIPV4Address();
        if (ip != null) {
            Assert.assertTrue(Netx.isIPV4(ip));
        }

        ip = Netx.getLocalIPV4Address("8.8.8.8");
        Assert.assertNotNull(ip);
        Assert.assertTrue(Netx.isIPV4(ip));
    }

    @Test
    public void testExternalIPV4From() {
        String ipv4 = null;
        try {
            ipv4 = Netx.getExternalIPV4AddressFrom(new URL("http://pv.sohu.com/cityjson"), Regexx.IPV4);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Assert.assertNotNull(ipv4);
        Assert.assertTrue("ipv4: " + ipv4, Netx.isIPV4(ipv4));
    }

    @Test
    public void testExternalIPV4FromSohu() {
        String ipv4 = Netx.getExternalIPV4AddressFromSohu();
        Assert.assertNotNull(ipv4);
        Assert.assertTrue("ipv4: " + ipv4, Netx.isIPV4(ipv4));
    }

    @Test
    public void testExternalIPV4() {
        String ipv4 = Netx.getExternalIPV4Address();
        Assert.assertNotNull(ipv4);
        Assert.assertTrue("ipv4: " + ipv4, Netx.isIPV4(ipv4));
    }

    @Test
    public void testCity() {
        Netx.City city = Netx.getCityFromSohu();
        Assert.assertNotNull(city);
        Assert.assertNotNull(city.getId());
        Assert.assertNotNull(city.getName());
        Assert.assertTrue("ipv4: " + city.getIp(), Netx.isIPV4(city.getIp()));

        Netx.City city2 = Netx.getCity();
        Assert.assertNotNull(city2);
        Assert.assertNotNull(city2.getId());
        Assert.assertNotNull(city2.getName());
        Assert.assertTrue("ipv4: " + city2.getIp(), Netx.isIPV4(city2.getIp()));
    }

    @Test
    public void testIpLong2String() {
        String ip = "221.217.228.166";
        Assert.assertEquals(Netx.ipLongToString(Netx.ipStringToLong(ip)), ip);
    }
}
