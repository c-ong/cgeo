package cgeo.geocaching.apps.cache.navi;

import cgeo.geocaching.R;
import cgeo.geocaching.cgCache;
import cgeo.geocaching.Waypoint;

import android.app.Activity;

class DownloadStaticMapsApp extends AbstractStaticMapsApp {

    DownloadStaticMapsApp() {
        super(getString(R.string.cache_menu_download_map_static));
    }

    @Override
    public boolean isEnabled(cgCache cache) {
        return !cache.hasStaticMap();
    }

    @Override
    public boolean isEnabled(Waypoint waypoint) {
        return !hasStaticMap(waypoint);
    }

    @Override
    public void navigate(Activity activity, cgCache cache) {
        invokeStaticMaps(activity, cache, null, true);
    }

    @Override
    public void navigate(Activity activity, Waypoint waypoint) {
        invokeStaticMaps(activity, null, waypoint, true);
    }
}
