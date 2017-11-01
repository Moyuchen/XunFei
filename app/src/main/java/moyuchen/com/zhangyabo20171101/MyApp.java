package moyuchen.com.zhangyabo20171101;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * User: 张亚博
 * Date: 2017-11-01 08:30
 * Description：
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=59c0f8cf");
    }
}
