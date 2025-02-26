package com.polar.nextcloudservices.Interfaces;

import android.content.Context;

import com.polar.nextcloudservices.NotificationService;

import org.json.JSONObject;

/*
 * Nextcloud abstract API crates possibility to use different libraries for
 * polling for notifications. This is needed to use Nextcloud SSO library
 * since it does not give per-app key.
 * The inheritors of this interface should be passed to NotificationService.
 */
public interface NextcloudAbstractAPI {
    public JSONObject getNotifications(NotificationService service, Context context);
}
