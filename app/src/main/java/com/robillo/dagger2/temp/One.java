package com.robillo.dagger2.temp;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by robinkamboj on 26/09/17.
 */

public class One extends Service{

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
