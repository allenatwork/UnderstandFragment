package allen.understandfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Allen_Fragment";
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        if (fragmentManager.findFragmentById(R.id.frame_content) == null) {
            fragmentManager.beginTransaction().add(R.id.frame_content, new FragmentA(), "A").addToBackStack("A").commit();
        }
    }

    public void logFragmentTrace() {
        List<Fragment> listFragments = fragmentManager.getFragments();
        log("List fragment size " + listFragments.size());
        log("LIST FRAGMENT:");
        for (Fragment fragment : listFragments) {
            if (fragment != null)
                log(fragment.getClass().getSimpleName() + ". Visible State:" + fragment.isVisible());
        }

    }

    public void log(String mes) {
        Log.d(TAG, mes);
    }
}
