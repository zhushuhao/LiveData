package dao.d.com.livedata.singleton;

import android.arch.lifecycle.ViewModel;

public class SingletonViewModel extends ViewModel {


    private SingletonLiveData content;

    public SingletonLiveData getContent() {
        if (content == null) {
            content = SingletonLiveData.getInstance();
        }
        return content;
    }

    public void setContent(SingletonLiveData content) {
        this.content = content;
    }


    /**
     * 改变
     */
    public void changeContent(String text) {
        content.setValue(text);
    }
}
