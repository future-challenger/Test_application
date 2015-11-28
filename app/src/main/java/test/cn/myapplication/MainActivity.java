package test.cn.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.util.SparseIntArray;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();

    private SparseArray<Fragment> mFragmentArray = new SparseArray<Fragment>(4);
    private SparseIntArray mTabIndexArray = new SparseIntArray(5);
    private int mCurrentFragmentIndex;  // currently selected fragment
    private int mClickedFragmentIndex;  // just clicked fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    private void setUpFragments(Bundle savedInstanceState) {
if(mFragmentArray.size() != 4){
    mFragmentArray.put(R.id.);
}
    }
}
