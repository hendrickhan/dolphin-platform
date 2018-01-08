package com.canoo.platform.logging;

import com.canoo.dp.impl.platform.core.Assert;
import com.canoo.platform.core.DolphinRuntimeException;
import com.canoo.platform.core.functional.Subscription;
import com.canoo.platform.logging.spi.LogMessage;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class Logging {

    private final static Logging INSTANCE = new Logging();

    private Logging() {
    }

    public void applyConfiguration(final DolphinLoggerConfiguration configuration) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public List<Marker> addGlobalMarker(final Marker marker) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public List<Marker> addGlobalMarker(final String... markers) {
        Assert.requireNonNull(markers, "markers");
        Arrays.asList(markers).forEach(m -> addGlobalMarker(m));
        return getGlobalMarkers();
    }

    public List<Marker> addGlobalMarker(final String marker) {
        return addGlobalMarker(getMarker(marker));
    }

    public List<Marker> removeGlobalMarker(final Marker marker) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public List<Marker> removeGlobalMarker(final String marker) {
        return removeGlobalMarker(getMarker(marker));
    }

    public List<Marker> addGlobalMarkers(final Collection<Marker> markers) {
        Assert.requireNonNull(markers, "markers");
        markers.forEach(m -> addGlobalMarker(m));
        return getGlobalMarkers();
    }

    public List<Marker> removeGlobalMarkers(final Collection<Marker> markers) {
        Assert.requireNonNull(markers, "markers");
        markers.forEach(m -> removeGlobalMarker(m));
        return getGlobalMarkers();
    }

    public List<Marker> getGlobalMarkers() {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public List<LogMessage> getLogCache() {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public void clearLogCache() {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public void putInThreadContext(final String key, final String val) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public void removeFromThreadContext(final String key) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public void clearThreadContext() {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public Marker getMarker(final String markerText) {
        return MarkerFactory.getMarker(markerText);
    }

    public Subscription addLoggingListener(final Consumer<List<LogMessage>> listener) {
        throw new DolphinRuntimeException("Not yet implemented!");
    }

    public static Logging getInstance() {
        return INSTANCE;
    }
}
