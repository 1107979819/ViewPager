package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.wenyl.viewpager.viewpager.R;


public class FragmentD extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d, container, false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        //记得移除

    }


}
