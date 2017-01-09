package allen.understandfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends BaseFragment {


    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.move).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragA = getActivity().getSupportFragmentManager().findFragmentByTag("A");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_content, fragA, "A").addToBackStack("A").commit();
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        ((MainActivity) getActivity()).logFragmentTrace();
    }
}
