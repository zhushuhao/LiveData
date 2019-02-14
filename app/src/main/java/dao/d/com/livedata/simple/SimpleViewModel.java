package dao.d.com.livedata.simple;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SimpleViewModel extends ViewModel {

    private MutableLiveData<String> content;

    public MutableLiveData<String> getContent() {
        if (content == null) {
            content = new MutableLiveData<>();
        }
        return content;
    }

    public void setContent(MutableLiveData<String> content) {
        this.content = content;
    }


    /**
     * 获取数据
     */
    public void getContentData() {
        content.setValue("我是获取到的数据");
    }
}
