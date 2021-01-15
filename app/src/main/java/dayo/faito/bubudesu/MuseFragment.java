package dayo.faito.bubudesu;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;


public class MuseFragment extends Fragment {
    private static final String TAG = "MuseFragment";

    private ImageView btnHonoka, btnKotori, btnUmi, btnMaki, btnRin, btnHanayo, btnEli, btnNozomi, btnNico;
    
    private Random r;

    private String msg;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.muse_fragment,container,false);
        r = new Random();
        msg = "";
        btnHonoka = (ImageView) view.findViewById(R.id.btnHonoka);
        btnKotori = (ImageView) view.findViewById(R.id.btnKotori);
        btnUmi = (ImageView) view.findViewById(R.id.btnUmi);
        btnMaki = (ImageView) view.findViewById(R.id.btnMaki);
        btnRin = (ImageView) view.findViewById(R.id.btnRin);
        btnHanayo = (ImageView) view.findViewById(R.id.btnHanayo);
        btnEli = (ImageView) view.findViewById(R.id.btnEli);
        btnNozomi = (ImageView) view.findViewById(R.id.btnNozomi);
        btnNico = (ImageView) view.findViewById(R.id.btnNico);

        /* HONOKA */
        final MediaPlayer mHonokaSound1, mHonokaSound2, mHonokaSound3, mHonokaSound4, mHonokaSound5;
        mHonokaSound1 = new MediaPlayer(); mHonokaSound2 = new MediaPlayer(); mHonokaSound3 = new MediaPlayer(); mHonokaSound4 = new MediaPlayer(); mHonokaSound5 = new MediaPlayer();
        prepareAudio(mHonokaSound1, R.raw.honoka1);
        prepareAudio(mHonokaSound2, R.raw.honoka2);
        prepareAudio(mHonokaSound3, R.raw.honoka3);
        prepareAudio(mHonokaSound4, R.raw.honoka4);
        prepareAudio(mHonokaSound5, R.raw.honoka5);
        btnHonoka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mHonokaSound1.start();
                        msg = "Good morning! Let's do our best today!";
                        showSnack(msg, mHonokaSound1.getDuration());
                        break;
                    case 2:
                        mHonokaSound2.start();
                        msg = "Great job! You worked really hard today!";
                        showSnack(msg, mHonokaSound2.getDuration());
                        break;
                    case 3:
                        mHonokaSound3.start();
                        msg = "How are you doing? Don't push yourself too hard.";
                        showSnack(msg, mHonokaSound3.getDuration());
                        break;
                    case 4:
                        mHonokaSound4.start();
                        msg = "Are you tired? Should I give you a massage?";
                        showSnack(msg, mHonokaSound4.getDuration());
                        break;
                    case 5:
                        mHonokaSound5.start();
                        msg = "Nothing makes me happier than getting a present with a lot of love and thought put into it!";
                        showSnack(msg, mHonokaSound5.getDuration());
                        break;
                }
            }
        });

        /* KOTORI */
        final MediaPlayer mKotoriSound1, mKotoriSound2, mKotoriSound3, mKotoriSound4, mKotoriSound5;
        mKotoriSound1 = new MediaPlayer(); mKotoriSound2 = new MediaPlayer(); mKotoriSound3 = new MediaPlayer(); mKotoriSound4 = new MediaPlayer(); mKotoriSound5 = new MediaPlayer();
        prepareAudio(mKotoriSound1, R.raw.kotori1);
        prepareAudio(mKotoriSound2, R.raw.kotori2);
        prepareAudio(mKotoriSound3, R.raw.kotori3);
        prepareAudio(mKotoriSound4, R.raw.kotori4);
        prepareAudio(mKotoriSound5, R.raw.kotori5);
        btnKotori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mKotoriSound1.start();
                        msg = "Great job! You didn't push yourself too hard, right?";
                        showSnack(msg, mKotoriSound1.getDuration());
                        break;
                    case 2:
                        mKotoriSound2.start();
                        msg = "I'm going to do my best, to make everyone happy.";
                        showSnack(msg, mKotoriSound2.getDuration());
                        break;
                    case 3:
                        mKotoriSound3.start();
                        msg = "Seeing you makes me happy.";
                        showSnack(msg, mKotoriSound3.getDuration());
                        break;
                    case 4:
                        mKotoriSound4.start();
                        msg = "With you... I get this feeling of fate.";
                        showSnack(msg, mKotoriSound4.getDuration());
                        break;
                    case 5:
                        mKotoriSound5.start();
                        msg = "It's Christmas! Is your stocking ready to get stuffed?";
                        showSnack(msg, mKotoriSound5.getDuration());
                        break;
                }
            }
        });

        /* UMI */
        final MediaPlayer mUmiSound1, mUmiSound2, mUmiSound3, mUmiSound4, mUmiSound5;
        mUmiSound1 = new MediaPlayer(); mUmiSound2 = new MediaPlayer(); mUmiSound3 = new MediaPlayer(); mUmiSound4 = new MediaPlayer(); mUmiSound5 = new MediaPlayer();
        prepareAudio(mUmiSound1, R.raw.umi1);
        prepareAudio(mUmiSound2, R.raw.umi2);
        prepareAudio(mUmiSound3, R.raw.umi3);
        prepareAudio(mUmiSound4, R.raw.umi4);
        prepareAudio(mUmiSound5, R.raw.umi5);
        btnUmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mUmiSound1.start();
                        msg = "Let's work hard today, too.";
                        showSnack(msg, mUmiSound1.getDuration());
                        break;
                    case 2:
                        mUmiSound2.start();
                        msg = "Thanks for your hard work. Get to bed early, so you can be prepared for tomorrow.";
                        showSnack(msg, mUmiSound2.getDuration());
                        break;
                    case 3:
                        mUmiSound3.start();
                        msg = "I'm not giving up until I've achieved my Goal!";
                        showSnack(msg, mUmiSound3.getDuration());
                        break;
                    case 4:
                        mUmiSound4.start();
                        msg = "It's freezing... Be careful not to catch a cold, OK?";
                        showSnack(msg, mUmiSound4.getDuration());
                        break;
                    case 5:
                        mUmiSound5.start();
                        msg = "What a scrumptious looking Christmas cake... Kotori, we're all going to end up eating too much!";
                        showSnack(msg, mUmiSound5.getDuration());
                        break;
                }
            }
        });

        /* RIN */
        final MediaPlayer mRinSound1, mRinSound2, mRinSound3, mRinSound4, mRinSound5;
        mRinSound1 = new MediaPlayer(); mRinSound2 = new MediaPlayer(); mRinSound3 = new MediaPlayer(); mRinSound4 = new MediaPlayer(); mRinSound5 = new MediaPlayer();
        prepareAudio(mRinSound1, R.raw.rin1);
        prepareAudio(mRinSound2, R.raw.rin2);
        prepareAudio(mRinSound3, R.raw.rin3);
        prepareAudio(mRinSound4, R.raw.rin4);
        prepareAudio(mRinSound5, R.raw.rin5);
        btnRin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mRinSound1.start();
                        msg = "I love everyone in μ's!";
                        showSnack(msg, mRinSound1.getDuration());
                        break;
                    case 2:
                        mRinSound2.start();
                        msg = "All right, let's make our voices heard!";
                        showSnack(msg, mRinSound2.getDuration());
                        break;
                    case 3:
                        mRinSound3.start();
                        msg = "Keep working hard toward your Goal!";
                        showSnack(msg, mRinSound3.getDuration());
                        break;
                    case 4:
                        mRinSound4.start();
                        msg = "Of course, this is so embarrassing...";
                        showSnack(msg, mRinSound4.getDuration());
                        break;
                    case 5:
                        mRinSound5.start();
                        msg = "Huh? You haven't put up a Christmas tree yet? I want to come and help you!";
                        showSnack(msg, mRinSound5.getDuration());
                        break;
                }
            }
        });

        /* MAKI */
        final MediaPlayer mMakiSound1, mMakiSound2, mMakiSound3, mMakiSound4, mMakiSound5;
        mMakiSound1 = new MediaPlayer(); mMakiSound2 = new MediaPlayer(); mMakiSound3 = new MediaPlayer(); mMakiSound4 = new MediaPlayer(); mMakiSound5 = new MediaPlayer();
        prepareAudio(mMakiSound1, R.raw.maki1);
        prepareAudio(mMakiSound2, R.raw.maki2);
        prepareAudio(mMakiSound3, R.raw.maki3);
        prepareAudio(mMakiSound4, R.raw.maki4);
        prepareAudio(mMakiSound5, R.raw.maki5);
        btnMaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mMakiSound1.start();
                        msg = "There's nothing wrong with doing what you like.";
                        showSnack(msg, mMakiSound1.getDuration());
                        break;
                    case 2:
                        mMakiSound2.start();
                        msg = "Hey, I didn't give you permission to forget about me.";
                        showSnack(msg, mMakiSound2.getDuration());
                        break;
                    case 3:
                        mMakiSound3.start();
                        msg = "So cold... But winter is beautiful, don't you agree?";
                        showSnack(msg, mMakiSound3.getDuration());
                        break;
                    case 4:
                        mMakiSound4.start();
                        msg = "Relationships with friends are important. You should check on them.";
                        showSnack(msg, mMakiSound4.getDuration());
                        break;
                    case 5:
                        mMakiSound5.start();
                        msg = "Santa doesn't bring presents to naughty children. You've got to be nice all year long.";
                        showSnack(msg, mMakiSound5.getDuration());
                        break;
                }
            }
        });

        /* HANAYO */
        final MediaPlayer mHanayoSound1, mHanayoSound2, mHanayoSound3, mHanayoSound4, mHanayoSound5;
        mHanayoSound1 = new MediaPlayer(); mHanayoSound2 = new MediaPlayer(); mHanayoSound3 = new MediaPlayer(); mHanayoSound4 = new MediaPlayer(); mHanayoSound5 = new MediaPlayer();
        prepareAudio(mHanayoSound1, R.raw.hanayo1);
        prepareAudio(mHanayoSound2, R.raw.hanayo2);
        prepareAudio(mHanayoSound3, R.raw.hanayo3);
        prepareAudio(mHanayoSound4, R.raw.hanayo4);
        prepareAudio(mHanayoSound5, R.raw.hanayo5);
        btnHanayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mHanayoSound1.start();
                        msg = "Oh... Le-Let's do our best!";
                        showSnack(msg, mHanayoSound1.getDuration());
                        break;
                    case 2:
                        mHanayoSound2.start();
                        msg = "Oogh... Um... Someone please...save...me...";
                        showSnack(msg, mHanayoSound2.getDuration());
                        break;
                    case 3:
                        mHanayoSound3.start();
                        msg = "I want you to remember me sometimes, if even just a little...";
                        showSnack(msg, mHanayoSound3.getDuration());
                        break;
                    case 4:
                        mHanayoSound4.start();
                        msg = "I like you as much as I like white rice!";
                        showSnack(msg, mHanayoSound4.getDuration());
                        break;
                    case 5:
                        mHanayoSound5.start();
                        msg = "Christmas means cake! I've got one right here, so let's dig in!";
                        showSnack(msg, mHanayoSound5.getDuration());
                        break;
                }
            }
        });

        /* ELI */
        final MediaPlayer mEliSound1, mEliSound2, mEliSound3, mEliSound4, mEliSound5;
        mEliSound1 = new MediaPlayer(); mEliSound2 = new MediaPlayer(); mEliSound3 = new MediaPlayer(); mEliSound4 = new MediaPlayer(); mEliSound5 = new MediaPlayer();
        prepareAudio(mEliSound1, R.raw.eli1);
        prepareAudio(mEliSound2, R.raw.eli2);
        prepareAudio(mEliSound3, R.raw.eli3);
        prepareAudio(mEliSound4, R.raw.eli4);
        prepareAudio(mEliSound5, R.raw.eli5);
        btnEli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mEliSound1.start();
                        msg = "Thanks for all your hard work. You did great!";
                        showSnack(msg, mEliSound1.getDuration());
                        break;
                    case 2:
                        mEliSound2.start();
                        msg = "I should finish my student council duties before it's too late.";
                        showSnack(msg, mEliSound2.getDuration());
                        break;
                    case 3:
                        mEliSound3.start();
                        msg = "Make sure you understand your Goal, and then do your best.";
                        showSnack(msg, mEliSound3.getDuration());
                        break;
                    case 4:
                        mEliSound4.start();
                        msg = "You take good care of yourself, OK?";
                        showSnack(msg, mEliSound4.getDuration());
                        break;
                    case 5:
                        mEliSound5.start();
                        msg = "Merry Christmas! Santa Elichika has a present just for you.\n";
                        showSnack(msg, mEliSound5.getDuration());
                        break;
                }
            }
        });

        /* NOZOMI */
        final MediaPlayer mNozomiSound1, mNozomiSound2, mNozomiSound3, mNozomiSound4, mNozomiSound5;
        mNozomiSound1 = new MediaPlayer(); mNozomiSound2 = new MediaPlayer(); mNozomiSound3 = new MediaPlayer(); mNozomiSound4 = new MediaPlayer(); mNozomiSound5 = new MediaPlayer();
        prepareAudio(mNozomiSound1, R.raw.nozomi1);
        prepareAudio(mNozomiSound2, R.raw.nozomi2);
        prepareAudio(mNozomiSound3, R.raw.nozomi3);
        prepareAudio(mNozomiSound4, R.raw.nozomi4);
        prepareAudio(mNozomiSound5, R.raw.nozomi5);
        btnNozomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mNozomiSound1.start();
                        msg = "Let's work together to make everyone happy!";
                        showSnack(msg, mNozomiSound1.getDuration());
                        break;
                    case 2:
                        mNozomiSound2.start();
                        msg = "Today's fortune predicts a good day.";
                        showSnack(msg, mNozomiSound2.getDuration());
                        break;
                    case 3:
                        mNozomiSound3.start();
                        msg = "Great job! You'll be sure to get some good rest, right?";
                        showSnack(msg, mNozomiSound3.getDuration());
                        break;
                    case 4:
                        mNozomiSound4.start();
                        msg = "Hmm... There's nothing wrong with being hugged every now and then.";
                        showSnack(msg, mNozomiSound4.getDuration());
                        break;
                    case 5:
                        mNozomiSound5.start();
                        msg = "This year, Eli is Santa, and I'm her reindeer. We're bringing happiness and joy to everyone!";
                        showSnack(msg, mNozomiSound5.getDuration());
                        break;
                }
            }
        });

        /* NICO */
        final MediaPlayer mNicoSound1, mNicoSound2, mNicoSound3, mNicoSound4, mNicoSound5;
        mNicoSound1 = new MediaPlayer(); mNicoSound2 = new MediaPlayer(); mNicoSound3 = new MediaPlayer(); mNicoSound4 = new MediaPlayer(); mNicoSound5 = new MediaPlayer();
        prepareAudio(mNicoSound1, R.raw.nico1);
        prepareAudio(mNicoSound2, R.raw.nico2);
        prepareAudio(mNicoSound3, R.raw.nico3);
        prepareAudio(mNicoSound4, R.raw.nico4);
        prepareAudio(mNicoSound5, R.raw.nico5);
        btnNico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mNicoSound1.start();
                        msg = "All right, it's time to show the world how cute I am!";
                        showSnack(msg, mNicoSound1.getDuration());
                        break;
                    case 2:
                        mNicoSound2.start();
                        msg = "Thanks for your hard work. Let's carry on doing our best!";
                        showSnack(msg, mNicoSound2.getDuration());
                        break;
                    case 3:
                        mNicoSound3.start();
                        msg = "What do you think you're doing? ...Ni...Nico-Nico-Ni...";
                        showSnack(msg, mNicoSound3.getDuration());
                        break;
                    case 4:
                        mNicoSound4.start();
                        msg = "Please tell me you didn't forget about me!";
                        showSnack(msg, mNicoSound4.getDuration());
                        break;
                    case 5:
                        mNicoSound5.start();
                        msg = "Merry Christmas! I shine brightest of all on this holiest of nights.";
                        showSnack(msg, mNicoSound5.getDuration());
                        break;
                }
            }
        });

        return view;
    }

    private void showSnack(String message, int duration) {
        Snackbar.make(getView(), message, duration).show();
        new CountDownTimer(duration, 1000) {
            public void onTick(long millisUntilFinished) {
                getActivity().getWindow().setFlags(
                        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                        WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
            public void onFinish() {
                getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        }.start();

        /*
        final Toast t = Toast.makeText(getActivity(), message, toastType);
        if (duration != 0) {
            new CountDownTimer(duration*1000, 1000) {
                public void onTick(long millisUntilFinished) {
                    t.show();
                    getActivity().getWindow().setFlags(
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                }
                public void onFinish() {
                    getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                }
            }.start();
        } else {
            t.show();
            new CountDownTimer(4000, 1000) {
                public void onTick(long millisUntilFinished) {
                    getActivity().getWindow().setFlags(
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                }
                public void onFinish() {
                    getActivity().getWindow().clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                }
            }.start();
        }
        */

    }

    private void prepareAudio(MediaPlayer mp, int raw_file) {
        Uri path = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + raw_file);
        try {
            mp.setDataSource(getActivity().getApplicationContext(), path);
            mp.prepare();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
