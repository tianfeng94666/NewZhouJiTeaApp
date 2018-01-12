package newzhoujiteaapp.presenter.impl;

import newzhoujiteaapp.model.impl.LoginModelImpl;
import newzhoujiteaapp.presenter.LoginPresenter;
import newzhoujiteaapp.view.LoginView;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private final LoginView loginView;
    private LoginModelImpl loginModelImpl;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginModelImpl = new LoginModelImpl();
    }

    @Override
    public void login(String name, String password) {
        loginView.login(name,password);
    }

    @Override
    public void loginSuccess(String result) {

    }

    @Override
    public void LoginFail(String result) {

    }
}
