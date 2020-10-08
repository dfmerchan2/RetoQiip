package co.com.reto.qiip.utilities.openuv;

import static co.com.reto.qiip.utilities.openuv.ConstantesOpenuv.*;

public class GenerarUrl {

    private GenerarUrl() {
    }

    public static String apiUv(String lat, String lng, String alt, String ozone, String dt) {
        return "?" + LAT + "=" + lat + "&" + LNG + "=" + lng + "&" + ALT + "=" + alt + "&" + OZONE + "=" + ozone + "&" + DT + "=" + dt;
    }
}
