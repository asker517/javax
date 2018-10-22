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

package me.panpf.javax.net;

import me.panpf.javax.io.IOStreamx;
import me.panpf.javax.lang.Stringx;
import me.panpf.javax.util.Regexx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.Enumeration;
import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class Netx {

    /**
     * Return true if the given ip address is IP v4
     */
    public static boolean isIPV4(@Nullable CharSequence ipAddress) {
        return Regexx.matches(Regexx.IPV4, Stringx.orEmpty(ipAddress));
    }

    /**
     * Return true if the given ip address is IP v6
     */
    public static boolean isIPV6(@Nullable CharSequence ipAddress) {
        return Regexx.matches(Regexx.IPV6, Stringx.orEmpty(ipAddress));
    }

    /**
     * Get local IP address
     */
    @Nullable
    public static String getLocalIPAddress() {
        String ipAddress = null;
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface networkInterface = en.nextElement();
                for (Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses(); inetAddresses.hasMoreElements(); ) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        ipAddress = inetAddress.getHostAddress();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ("fe80:0:0:0:0:0:0:1%lo0".equalsIgnoreCase(ipAddress)) {
            ipAddress = null;
        }
        return Stringx.isSafe(ipAddress) ? ipAddress : null;
    }

    /**
     * Get local IP address
     */
    @NotNull
    public static String getLocalIPAddress(@NotNull String defaultIpAddress) {
        String ipAddress = getLocalIPAddress();
        return Stringx.isSafe(ipAddress) ? ipAddress : defaultIpAddress;
    }

    /**
     * Get local IPV4 address
     */
    @Nullable
    public static String getLocalIPV4Address() {
        String ipAddress = null;
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface networkInterface = en.nextElement();
                for (Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses(); inetAddresses.hasMoreElements(); ) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                        ipAddress = inetAddress.getHostAddress();
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Stringx.isSafe(ipAddress) ? ipAddress : null;
    }

    /**
     * Get local IPV4 address
     */
    @NotNull
    public static String getLocalIPV4Address(@NotNull String defaultIpAddress) {
        String ipAddress = getLocalIPV4Address();
        return Stringx.isSafe(ipAddress) ? ipAddress : defaultIpAddress;
    }

    /**
     * Request the specified URL and then extract the external IP v4 address with the given regular expression
     */
    @Nullable
    public static String getExternalIPV4AddressFrom(@NotNull URL url, @NotNull Pattern pattern) {
        try {
            return Stringx.orEmpty(Regexx.getFirst(pattern, IOStreamx.readText(url)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Get the external IP v4 address from the API provided by Sohu
     */
    @Nullable
    public static String getExternalIPV4AddressFromSohu() {
        String ipv4 = null;
        try {
            ipv4 = getExternalIPV4AddressFrom(new URL("http://pv.sohu.com/cityjson?ie=utf-8"), Regexx.IPV4);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (Stringx.isNotSafe(ipv4)) {
            try {
                ipv4 = getExternalIPV4AddressFrom(new URL("http://txt.go.sohu.com/ip/soip"), Regexx.IPV4);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return ipv4;
    }

    /**
     * Get external network IP v4 address
     */
    @Nullable
    public static String getExternalIPV4Address() {
        return getExternalIPV4AddressFromSohu();
    }
}
