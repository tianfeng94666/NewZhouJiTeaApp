package newzhoujiteaapp.view;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public interface LoginView {
    void login(String name,String password);
    void showLoading();
    void hideLoading();
    void showResult(String string);
}
