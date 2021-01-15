package dayo.faito.bubudesu;

import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * BubuDesuwa is an application that plays Love Live messages.
 * It is also Calvin Yu's 2018 Christmas gift made by and from his girlfriend, Diana Chou. :)
 *
 * @author  Diana Chou
 * @version 1.0
 * @since   12/25/2018
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    private MediaPlayer mp;

    private ImageView btnSound, btnMusicBox, btnJazz, btnPiano;

    private boolean jazzIsPlaying, musicboxIsPlaying, pianoIsPlaying, soundOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

        mp = MediaPlayer.create(MainActivity.this, R.raw.snow_halation);
        mp.setLooping(true);
        mp.start();
        musicboxIsPlaying = false; jazzIsPlaying = false; pianoIsPlaying = true; soundOff = false;

        /* Floating Action Buttons for Music and Sound */
        btnMusicBox = (ImageView) findViewById(R.id.btnMusicBox);
        btnMusicBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!musicboxIsPlaying) {
                    mp.stop();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.snow_halation_musicbox);
                    mp.setLooping(true);
                    mp.start();
                    musicboxIsPlaying = true; jazzIsPlaying = false; pianoIsPlaying = false;
                    if (soundOff) {
                        mp.setVolume(0,0);
                    }
                }
            }
        });
        btnJazz = (ImageView) findViewById(R.id.btnJazz);
        btnJazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!jazzIsPlaying) {
                    mp.stop();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.snow_halation_jazz);
                    mp.setLooping(true);
                    mp.start();
                    musicboxIsPlaying = false; jazzIsPlaying = true; pianoIsPlaying = false;
                    if (soundOff) {
                        mp.setVolume(0,0);
                    }
                }
            }
        });
        btnPiano = (ImageView) findViewById(R.id.btnPiano);
        btnPiano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!pianoIsPlaying) {
                    mp.stop();
                    mp = MediaPlayer.create(MainActivity.this, R.raw.snow_halation);
                    mp.setLooping(true);
                    mp.start();
                    musicboxIsPlaying = false; jazzIsPlaying = false; pianoIsPlaying = true;
                    if (soundOff) {
                        mp.setVolume(0,0);
                    }
                }
            }
        });
        btnSound = (ImageView) findViewById(R.id.btnSound);
        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (soundOff) {
                    mp.setVolume(1, 1);
                    soundOff = false;
                    ((ImageView) findViewById(R.id.btnSound)).setImageResource(R.drawable.sound_on);
                } else {
                    mp.setVolume(0, 0);
                    soundOff = true;
                    ((ImageView) findViewById(R.id.btnSound)).setImageResource(R.drawable.sound_off);
                }
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mp!=null && mp.isPlaying()){
            mp.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(mp!=null && !mp.isPlaying()){
            mp.start();
        }
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new MuseFragment(), "Muse");
        adapter.addFragment(new AquorsFragment(), "Aquors");
        viewPager.setAdapter(adapter);
    }

}
