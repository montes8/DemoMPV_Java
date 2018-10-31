package com.example.tayler_gabbi.demomvp_java.presenter;

public class LoginPresenterImpl implements LoginPresenter,LoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView, LoginInteractor loginInteractor) {
        this.loginView = loginView;
        this.loginInteractor = loginInteractor;
    }


    @Override
    public void validateCredencials(String userName, String password) {

        if(loginView!=null){
            loginView.showProgress();

        }
        loginInteractor.login(userName,password,this);
    }

    @Override
    public void onDestroy() {

        loginView = null;
        //evitar fuga de memoria

    }

    @Override
    public void onUserNameError() {

        if(loginView!=null){
            loginView.setUserNameError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onPasswordError() {

        if(loginView!=null){
            loginView.setPasswordError();
            loginView.hideProgress();
        }

    }

    @Override
    public void onUsuarioNull() {

        loginView.setUsuarioNull();
    }

    @Override
    public void onSuccess() {
        if(loginView!=null){
            loginView.navigateToHome();
            loginView.hideProgress();
        }

    }


}
