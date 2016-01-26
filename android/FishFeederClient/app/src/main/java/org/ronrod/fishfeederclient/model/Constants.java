package org.ronrod.fishfeederclient.model;

/**
 * Created by VASS on 13/01/2016.
 */
public final class Constants {
    public static final class app {

        public static final String SETTINGS_FILE = "fish_feeder.config";
    }

    public static final class commands {
        public static final String FEED = "FE";
        public static final String FEED_TIMES = "FT";
        public static final String FEED_INTERVAL = "FI";
        public static final String SAVE_DATA    = "SD";
        public static final String RESET_DATA    = "RD";
        public static final String STATUS    = "ST";
        public static final String CHANGE_SERVO_PIN = "CSPIN";
        public static final String CHANGE_STARTING_POS = "CSPOS";
        public static final String CHANGE_MID_POSITION = "CMPOS";
        public static final String CHANGE_END_POSITION = "CEPOS";
        public static final String CHANGE_LONG_DELAY = "CLDLY";
        public static final String CHANGE_SHORT_DELAY = "CSDLY";
        public static final String VERSION    = "VE";
    }
    public static final class responses {
        public static final String STATUS = "ST";
        public static final String FEED_INTERVAL = "FI";
        public static final String FEED_TIMES = "FT";
        public static final String LAST_FEED_TIME = "LF";
        public static final String SERVO_VARS = "SRV";
        public static final String NEXT_FEEDING = "NF";
    }
    public static final class status {
        public static final String STARTING = "0";
        public static final String NORMAL = "1";
        public static final String FEEDING = "2";
    }
}
