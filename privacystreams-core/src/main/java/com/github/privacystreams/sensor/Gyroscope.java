package com.github.privacystreams.sensor;

import com.github.privacystreams.core.Item;
import com.github.privacystreams.core.providers.MStreamProvider;
import com.github.privacystreams.utils.annotations.PSItem;
import com.github.privacystreams.utils.annotations.PSItemField;

/**
 * Gyroscope.
 */
@PSItem
public class Gyroscope extends Item {

    /**
     * Rate of rotation around the x axis.
     */
    @PSItemField(type = Float.class)
    public static final String X = "x";

    /**
     * Rate of rotation around the y axis.
     */
    @PSItemField(type = Float.class)
    public static final String Y = "y";

    /**
     * Rate of rotation around the z axis.
     */
    @PSItemField(type = Float.class)
    public static final String Z = "z";

    Gyroscope(float x, float y, float z) {
        this.setFieldValue(X, x);
        this.setFieldValue(Y, y);
        this.setFieldValue(Z, z);
    }

    /**
     * Provide a live stream of sensor readings from gyroscope.
     * @return the provider.
     */
    public static MStreamProvider asUpdates(int sensorDelay){
        return new GyroscopeUpdatesProvider(sensorDelay);
    }
}
