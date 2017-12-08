package demo.powerboot.powerboot.broadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import demo.powerboot.powerboot.MainActivity;


/**
 * Created by fby on 2017/6/26.
 */

public class BootCompletedReceiver extends BroadcastReceiver {

    static final String action_boot ="android.intent.action.BOOT_COMPLETED";


    @Override

    public void onReceive (Context context, Intent intent) {

        Log.i("charge completed", "启动完成");

        if (intent.getAction().equals(action_boot)){

            Intent mBootIntent = new Intent(context, MainActivity.class);
            // 下面这句话必须加上才能开机自动运行app的界面
            mBootIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mBootIntent);
        }
    }

}

