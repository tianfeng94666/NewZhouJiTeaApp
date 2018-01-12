package newzhoujiteaapp.presenter;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public interface LoginPresenter {
    void login(String name,String password);
    void loginSuccess(String result);
    void LoginFail(String result);
}
