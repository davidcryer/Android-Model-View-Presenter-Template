package com.davidcryer.androidmvptemplate.android.view.ui;

import android.app.Activity;
import android.os.Bundle;

public interface AndroidMvpView {
    Activity activity();

    interface EventsListener {
        void onSaveInstance(final Bundle outState);
    }
}
