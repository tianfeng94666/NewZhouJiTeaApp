package newzhoujiteaapp.model.impl;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import newzhoujiteaapp.model.LoginModel;
import newzhoujiteaapp.net.ApiService;
import newzhoujiteaapp.net.HttpManager;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(String name, String password) {
        HttpManager.getInstance().create(ApiService.class)
                .login(name,password)
                .subscribeOn(Schedulers.io())//指定被观察者在io线程完成
                .observeOn(AndroidSchedulers.mainThread())//指定观察者接收数据在主线程
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                });
    }
}
