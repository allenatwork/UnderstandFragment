package allen.understandfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Allen on 09-Jan-17.
 */

public class BaseFragment extends Fragment {
    public String TAG = this.getClass().getName();

    public void log(String mes) {
        Log.d(TAG, mes);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("ON CREATE");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        log("ON CREATE VIEW");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        log("ON VIEW CREATED");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        log("ON ACTIVITY CREATED");
    }

    @Override
    public void onStart() {
        super.onStart();
        log("ON START");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("ON RESUME");
    }

    @Override
    public void onPause() {
        super.onPause();
        log("ON PAUSE");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("ON STOP");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        log("ON DESTROY VIEW");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("ON DESTROY");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        log("ON SAVE INSTANT STATE");
    }
}
