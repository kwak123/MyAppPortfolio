package com.retroquack.kwak123.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    Button mPopularMovies;
    Button mStockHawk;
    Button mBuildItBigger;
    Button mMakeAppMaterial;
    Button mGoUbiquitous;
    Button mCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        mPopularMovies = (Button) findViewById(R.id.popular_movies);
        mStockHawk = (Button) findViewById(R.id.stock_hawk);
        mBuildItBigger = (Button) findViewById(R.id.build_it_bigger);
        mMakeAppMaterial = (Button) findViewById(R.id.make_app_material);
        mGoUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        mCapstone = (Button) findViewById(R.id.capstone);

        mPopularMovies.setOnClickListener(mOnClickListener);
        mStockHawk.setOnClickListener(mOnClickListener);
        mBuildItBigger.setOnClickListener(mOnClickListener);
        mMakeAppMaterial.setOnClickListener(mOnClickListener);
        mGoUbiquitous.setOnClickListener(mOnClickListener);
        mCapstone.setOnClickListener(mOnClickListener);

    }

    private OnClickListener mOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Button button = (Button) v;
            String ToastText = button.getText().toString();

            Toast.makeText(getApplicationContext(), getString(R.string.default_toast) + ToastText, Toast.LENGTH_SHORT).show();
            }
    };
}
