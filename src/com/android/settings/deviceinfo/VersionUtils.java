
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getSlimAOSPVersion(){
        return SystemProperties.get("org.slimaosp.version.display","");
    }
}
