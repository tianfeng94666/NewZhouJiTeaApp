package newzhoujiteaapp.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import newzhoujiteaapp.R;
import newzhoujiteaapp.base.BaseActivity;
import newzhoujiteaapp.presenter.LoginPresenter;
import newzhoujiteaapp.presenter.impl.LoginPresenterImpl;
import newzhoujiteaapp.view.LoginView;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public class MainActivity extends BaseActivity implements LoginView {

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;
    @BindView(R.id.et_login_password)
    EditText etLoginPassword;
    @BindView(R.id.tv_login_forget_password)
    TextView tvLoginForgetPassword;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.iv_weixin)
    ImageView ivWeixin;
    @BindView(R.id.iv_qq)
    ImageView ivQq;
    @BindView(R.id.ll_login)
    LinearLayout llLogin;
    private LoginPresenterImpl loginPresenterImpl;

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login2;
    }

    @Override
    public void initView() {

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(etPhone.getText().toString(), etLoginPassword.getText().toString());
            }
        });
        loginPresenterImpl = new LoginPresenterImpl(this);
    }


    @Override
    public void login(String name, String password) {
        loginPresenterImpl.login(name, password);
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "出现loading", Toast.LENGTH_LONG).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this, "dissloading", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showResult(String string) {
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
