package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.wenyl.viewpager.viewpager.R;


public class FragmentB extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        return view;
    }

    /**
     * 当前 Fragment 显示的时候回调
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
       // if (isVisibleToUser) adapter.notifyDataSetChanged();
    }

    /**
     * 当前Activity显示的回调
     */
    @Override
    public void onResume() {
        super.onResume();
      //  adapter.notifyDataSetChanged();
    }


}
