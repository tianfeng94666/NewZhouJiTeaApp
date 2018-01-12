package newzhoujiteaapp.net;



import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018/1/12 0012.
 */

public interface ApiService {
    /**
     * 登录
     */
    @POST("api/user/login")
    Observable<String> login(@Query("name")String name, @Query("password") String password);
}
