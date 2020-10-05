package com.example.myskeleton.modul.profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myskeleton.base.BasePresenter;
import com.example.myskeleton.base.BaseView;

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void setProfile(String email, String password);
    }

    interface Presenter extends BasePresenter {
        void initializeProfile(Bundle bundle);
    }
}
