package dao.d.com.livedata.singleton;

import android.arch.lifecycle.LiveData;

/**
 * 单例
 */
public class SingletonLiveData extends LiveData<String> {

    private SingletonLiveData() {
    }

    @Override
    public void postValue(String value) {
        super.postValue(value);
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }

    private static SingletonLiveData sInstance;

    public static SingletonLiveData getInstance() {
        if (sInstance == null) {
            sInstance = new SingletonLiveData();
        }
        return sInstance;
    }
}
