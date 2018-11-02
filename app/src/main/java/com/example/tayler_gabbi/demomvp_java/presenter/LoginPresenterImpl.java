package com.example.tayler_gabbi.demomvp_java.presenter;

import com.example.tayler_gabbi.demomvp_java.interactores.LoginInteractorImpl;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginInteractor;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginPresenter;
import com.example.tayler_gabbi.demomvp_java.interfaces.LoginView;
import com.example.tayler_gabbi.demomvp_java.interfaces.OnLoginFinishListener;

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishListener {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl();
    }

    @Override
    public void validateusuario(String user, String pass) {

        if(view != null){

            view.showProgress();
        }
        interactor.validateUser(user,pass,this);

    }

    @Override
    public void userNameError() {

        if(view != null){

            view.hideProgress();
            view.setErrorUser();
        }

    }

    @Override
    public void passwordError() {

        if(view != null){

            view.hideProgress();
            view.setErrorPassword();
        }

    }

    @Override
    public void usuarioLogin() {

    }

    @Override
    public void exitOperacion() {

        if(view != null){

            view.hideProgress();
            view.navigationToHome();
        }

    }
}
