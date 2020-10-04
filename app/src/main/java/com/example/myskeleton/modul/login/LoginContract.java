package com.example.myskeleton.modul.login;

import com.example.myskeleton.base.BasePresenter;
import com.example.myskeleton.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface LoginContract {
    interface View extends BaseView<Presenter> {
        void redirectToProfile();
    }

    interface Presenter extends BasePresenter {
        void performLogin(String email, String password);
    }
}
