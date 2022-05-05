package in.codingtimes.fragment_lifecycle_android;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("Fragment LifeCycle", "onCreateView Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onCreateView Called",Toast.LENGTH_SHORT).show();
       return inflater.inflate(R.layout.fragment_blank, container, false);

    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("Fragment LifeCycle", "onAttach Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onAttach Called",Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment LifeCycle", "onCreate Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onCreate Called",Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Fragment LifeCycle", "onDestroy Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onDestroy Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d("Fragment LifeCycle", "onDestroyView Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onDestroyView Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onDetach(){
        super.onDetach();
        Log.d("Fragment LifeCycle", "onDetach Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onDetach Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("Fragment LifeCycle", "onPause Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onPause Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("Fragment LifeCycle", "onResume Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onResume Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("Fragment LifeCycle", "onStart Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onStart Called",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("Fragment LifeCycle", "onStop Called");
        Toast.makeText(getActivity(),"Fragment Lifecycle, onStop Called",Toast.LENGTH_SHORT).show();
    }
}