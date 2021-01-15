package dayo.faito.bubudesu;

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

public class AquorsFragment extends Fragment {
    private static final String TAG = "AquorsFragment";

    private ImageView btnRiko, btnYou, btnChika, btnYoshiko, btnHanamaru, btnRuby, btnKanan, btnMari, btnDia;

    private Random r;

    private String msg;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aquors_fragment,container,false);
        r = new Random();
        msg = "";
        btnRiko = (ImageView) view.findViewById(R.id.btnRiko);
        btnYou = (ImageView) view.findViewById(R.id.btnYou);
        btnChika = (ImageView) view.findViewById(R.id.btnChika);
        btnYoshiko = (ImageView) view.findViewById(R.id.btnYoshiko);
        btnHanamaru = (ImageView) view.findViewById(R.id.btnHanamaru);
        btnRuby = (ImageView) view.findViewById(R.id.btnRuby);
        btnKanan = (ImageView) view.findViewById(R.id.btnKanan);
        btnMari = (ImageView) view.findViewById(R.id.btnMari);
        btnDia = (ImageView) view.findViewById(R.id.btnDia);


        /* RIKO */
        final MediaPlayer mRikoSound1, mRikoSound2, mRikoSound3, mRikoSound4, mRikoSound5;
        mRikoSound1 = new MediaPlayer(); mRikoSound2 = new MediaPlayer(); mRikoSound3 = new MediaPlayer(); mRikoSound4 = new MediaPlayer(); mRikoSound5 = new MediaPlayer();
        prepareAudio(mRikoSound1, R.raw.riko1);
        prepareAudio(mRikoSound2, R.raw.riko2);
        prepareAudio(mRikoSound3, R.raw.riko3);
        prepareAudio(mRikoSound4, R.raw.riko4);
        prepareAudio(mRikoSound5, R.raw.riko5);
        btnRiko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mRikoSound1.start();
                        msg = "Why don't you come listen to me play the piano sometime?";
                        showSnack(msg, mRikoSound1.getDuration());
                        break;
                    case 2:
                        mRikoSound2.start();
                        msg = "I want people from all over to hear Aqours sing.";
                        showSnack(msg, mRikoSound2.getDuration());
                        break;
                    case 3:
                        mRikoSound3.start();
                        msg = "I've still got plenty of energy, but if you're tired, please take a break.";
                        showSnack(msg, mRikoSound3.getDuration());
                        break;
                    case 4:
                        mRikoSound4.start();
                        msg = "I love to cook. You get to eat the results of your hard work! I guess I'm a bit of a glutton, huh?";
                        showSnack(msg, mRikoSound4.getDuration());
                        break;
                    case 5:
                        mRikoSound5.start();
                        msg = "Merry Christmas! Let's all enjoy our cake and make some fun memories.";
                        showSnack(msg, mRikoSound5.getDuration());
                        break;
                }
            }
        });

        /* YOU */
        final MediaPlayer mYouSound1, mYouSound2, mYouSound3, mYouSound4, mYouSound5;
        mYouSound1 = new MediaPlayer(); mYouSound2 = new MediaPlayer(); mYouSound3 = new MediaPlayer(); mYouSound4 = new MediaPlayer(); mYouSound5 = new MediaPlayer();
        prepareAudio(mYouSound1, R.raw.you1);
        prepareAudio(mYouSound2, R.raw.you2);
        prepareAudio(mYouSound3, R.raw.you3);
        prepareAudio(mYouSound4, R.raw.you4);
        prepareAudio(mYouSound5, R.raw.you5);
        btnYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mYouSound1.start();
                        msg = "Let's both do our best, okay? We'll sail across the ocean of school idolhood, and the future beyond!";
                        showSnack(msg, mYouSound1.getDuration());
                        break;
                    case 2:
                        mYouSound2.start();
                        msg = "If we all work together, we can accomplish anything!";
                        showSnack(msg, mYouSound2.getDuration());
                        break;
                    case 3:
                        mYouSound3.start();
                        msg = "Full speed ahead! Come set sail with You Watanabe!";
                        showSnack(msg, mYouSound3.getDuration());
                        break;
                    case 4:
                        mYouSound4.start();
                        msg = "*Giggle* I'm starting to think you've fallen for me!";
                        showSnack(msg, mYouSound4.getDuration());
                        break;
                    case 5:
                        mYouSound5.start();
                        msg = "Are you feeling a little blue? Santa You's here to sing you a happy Christmas carol!";
                        showSnack(msg, mYouSound5.getDuration());
                        break;
                }
            }
        });

        /* CHIKA */
        final MediaPlayer mChikaSound1, mChikaSound2, mChikaSound3, mChikaSound4, mChikaSound5;
        mChikaSound1 = new MediaPlayer(); mChikaSound2 = new MediaPlayer(); mChikaSound3 = new MediaPlayer(); mChikaSound4 = new MediaPlayer(); mChikaSound5 = new MediaPlayer();
        prepareAudio(mChikaSound1, R.raw.chika1);
        prepareAudio(mChikaSound2, R.raw.chika2);
        prepareAudio(mChikaSound3, R.raw.chika3);
        prepareAudio(mChikaSound4, R.raw.chika4);
        prepareAudio(mChikaSound5, R.raw.chika5);
        btnChika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mChikaSound1.start();
                        msg = "I'm always here for you if you need me!";
                        showSnack(msg, mChikaSound1.getDuration());
                        break;
                    case 2:
                        mChikaSound2.start();
                        msg = "It's all right. When you're feeling down or discouraged, I'm here for you.";
                        showSnack(msg, mChikaSound2.getDuration());
                        break;
                    case 3:
                        mChikaSound3.start();
                        msg = "Tee-hee. Somehow, being around you always perks me up.";
                        showSnack(msg, mChikaSound3.getDuration());
                        break;
                    case 4:
                        mChikaSound4.start();
                        msg = "It's all right. I'll never give up!";
                        showSnack(msg, mChikaSound4.getDuration());
                        break;
                    case 5:
                        mChikaSound5.start();
                        msg = "What do you think about one Chika Takami being your own personal Santa Claus this year?";
                        showSnack(msg, mChikaSound5.getDuration());
                        break;
                }
            }
        });

        /* YOSHIKO */
        final MediaPlayer mYoshikoSound1, mYoshikoSound2, mYoshikoSound3, mYoshikoSound4, mYoshikoSound5;
        mYoshikoSound1 = new MediaPlayer(); mYoshikoSound2 = new MediaPlayer(); mYoshikoSound3 = new MediaPlayer(); mYoshikoSound4 = new MediaPlayer(); mYoshikoSound5 = new MediaPlayer();
        prepareAudio(mYoshikoSound1, R.raw.yoshiko1);
        prepareAudio(mYoshikoSound2, R.raw.yoshiko2);
        prepareAudio(mYoshikoSound3, R.raw.yoshiko3);
        prepareAudio(mYoshikoSound4, R.raw.yoshiko4);
        prepareAudio(mYoshikoSound5, R.raw.yoshiko5);
        btnYoshiko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mYoshikoSound1.start();
                        msg = "Mwa-ha-ha. Won't you fall from grace along with Yohane?";
                        showSnack(msg, mYoshikoSound1.getDuration());
                        break;
                    case 2:
                        mYoshikoSound2.start();
                        msg = "Ignore Yohane and you'll be burned to a crisp by hellfire!";
                        showSnack(msg, mYoshikoSound2.getDuration());
                        break;
                    case 3:
                        mYoshikoSound3.start();
                        msg = "I'm quite confident in my singing and dancing. Shall I give you a lesson?";
                        showSnack(msg, mYoshikoSound3.getDuration());
                        break;
                    case 4:
                        mYoshikoSound4.start();
                        msg = "Hey! Don't call me Yoshiko!";
                        showSnack(msg, mYoshikoSound4.getDuration());
                        break;
                    case 5:
                        mYoshikoSound5.start();
                        msg = "Merry Christmas. Today, and today only, I'm bringing holy blessings.";
                        showSnack(msg, mYoshikoSound5.getDuration());
                        break;
                }
            }
        });

        /* HANAMARU */
        final MediaPlayer mHanamaruSound1, mHanamaruSound2, mHanamaruSound3, mHanamaruSound4, mHanamaruSound5;
        mHanamaruSound1 = new MediaPlayer(); mHanamaruSound2 = new MediaPlayer(); mHanamaruSound3 = new MediaPlayer(); mHanamaruSound4 = new MediaPlayer(); mHanamaruSound5 = new MediaPlayer();
        prepareAudio(mHanamaruSound1, R.raw.hanamaru1);
        prepareAudio(mHanamaruSound2, R.raw.hanamaru2);
        prepareAudio(mHanamaruSound3, R.raw.hanamaru3);
        prepareAudio(mHanamaruSound4, R.raw.hanamaru4);
        prepareAudio(mHanamaruSound5, R.raw.hanamaru5);
        btnHanamaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mHanamaruSound1.start();
                        msg = "If there's anything I can do to help, just say the word!";
                        showSnack(msg, mHanamaruSound1.getDuration());
                        break;
                    case 2:
                        mHanamaruSound2.start();
                        msg = "My heart starts racing whenever you touch me.";
                        showSnack(msg, mHanamaruSound2.getDuration());
                        break;
                    case 3:
                        mHanamaruSound3.start();
                        msg = "Ahh... Reading a good book cleanses the soul.";
                        showSnack(msg, mHanamaruSound3.getDuration());
                        break;
                    case 4:
                        mHanamaruSound4.start();
                        msg = "C'mon, pull on me! I wanna be taller. Grab my arms and pull up!";
                        showSnack(msg, mHanamaruSound4.getDuration());
                        break;
                    case 5:
                        mHanamaruSound5.start();
                        msg = "Merry Christmas! We can't spread any happiness if we don't have any ourselves!";
                        showSnack(msg, mHanamaruSound5.getDuration());
                        break;
                }
            }
        });

        /* RUBY */
        final MediaPlayer mRubySound1, mRubySound2, mRubySound3, mRubySound4, mRubySound5;
        mRubySound1 = new MediaPlayer(); mRubySound2 = new MediaPlayer(); mRubySound3 = new MediaPlayer(); mRubySound4 = new MediaPlayer(); mRubySound5 = new MediaPlayer();
        prepareAudio(mRubySound1, R.raw.ruby1);
        prepareAudio(mRubySound2, R.raw.ruby2);
        prepareAudio(mRubySound3, R.raw.ruby3);
        prepareAudio(mRubySound4, R.raw.ruby4);
        prepareAudio(mRubySound5, R.raw.ruby5);
        btnRuby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mRubySound1.start();
                        msg = "People tell me all the time that I move like a small animal.";
                        showSnack(msg, mRubySound1.getDuration());
                        break;
                    case 2:
                        mRubySound2.start();
                        msg = "*Mumble* Thank you for today.";
                        showSnack(msg, mRubySound2.getDuration());
                        break;
                    case 3:
                        mRubySound3.start();
                        msg = "I might not have what it takes to be a school idol...but I've always wanted to become one anyway.";
                        showSnack(msg, mRikoSound3.getDuration());
                        break;
                    case 4:
                        mRubySound4.start();
                        msg = "Spending time with you talking like this makes my heart start throbbing.";
                        showSnack(msg, mRubySound4.getDuration());
                        break;
                    case 5:
                        mRubySound5.start();
                        msg = "Merry Christmas! Being with you is the best gift anyone could ask for.";
                        showSnack(msg, mRubySound5.getDuration());
                        break;
                }
            }
        });

        /* KANAN */
        final MediaPlayer mKananSound1, mKananSound2, mKananSound3, mKananSound4, mKananSound5;
        mKananSound1 = new MediaPlayer(); mKananSound2 = new MediaPlayer(); mKananSound3 = new MediaPlayer(); mKananSound4 = new MediaPlayer(); mKananSound5 = new MediaPlayer();
        prepareAudio(mKananSound1, R.raw.kanan1);
        prepareAudio(mKananSound2, R.raw.kanan2);
        prepareAudio(mKananSound3, R.raw.kanan3);
        prepareAudio(mKananSound4, R.raw.kanan4);
        prepareAudio(mKananSound5, R.raw.kanan5);
        btnKanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mKananSound1.start();
                        msg = "You can always talk to me if you're worried about something.";
                        showSnack(msg, mKananSound1.getDuration());
                        break;
                    case 2:
                        mKananSound2.start();
                        msg = "You want a hug? Sure! C'mon over.";
                        showSnack(msg, mKananSound2.getDuration());
                        break;
                    case 3:
                        mKananSound3.start();
                        msg = "Wanna go diving with me? Don't be scared. I'll hold your hand.";
                        showSnack(msg, mKananSound3.getDuration());
                        break;
                    case 4:
                        mKananSound4.start();
                        msg = "Whenever I try to wink, I end up closing both eyes. Why can't I do it?";
                        showSnack(msg, mKananSound4.getDuration());
                        break;
                    case 5:
                        mKananSound5.start();
                        msg = "Merry Christmas! I hope that your day is full of happy times and joyous memories.";
                        showSnack(msg, mKananSound5.getDuration());
                        break;
                }
            }
        });

        /* MARI */
        final MediaPlayer mMariSound1, mMariSound2, mMariSound3, mMariSound4, mMariSound5;
        mMariSound1 = new MediaPlayer(); mMariSound2 = new MediaPlayer(); mMariSound3 = new MediaPlayer(); mMariSound4 = new MediaPlayer(); mMariSound5 = new MediaPlayer();
        prepareAudio(mMariSound1, R.raw.mari1);
        prepareAudio(mMariSound2, R.raw.mari2);
        prepareAudio(mMariSound3, R.raw.mari3);
        prepareAudio(mMariSound4, R.raw.mari4);
        prepareAudio(mMariSound5, R.raw.mari5);
        btnMari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(5) + 1;
                switch (random) {
                    case 1:
                        mMariSound1.start();
                        msg = "I'll come back whenever you need me!";
                        showSnack(msg, mMariSound1.getDuration());
                        break;
                    case 2:
                        mMariSound2.start();
                        msg = "We share an unshakeable, unbreakable bond.";
                        showSnack(msg, mMariSound2.getDuration());
                        break;
                    case 3:
                        mMariSound3.start();
                        msg = "I want to do everything I can to ensure we all have a happy and sparkling school life.";
                        showSnack(msg, mMariSound3.getDuration());
                        break;
                    case 4:
                        mMariSound4.start();
                        msg = "I'll do whatever I can to make this day fun and fulfilling for you!";
                        showSnack(msg, mMariSound4.getDuration());
                        break;
                    case 5:
                        mMariSound5.start();
                        msg = "Christmas presents are all fine and dandy, but it's really the thought that counts. Don't you agree?";
                        showSnack(msg, mMariSound5.getDuration());
                        break;
                }
            }
        });

        /* DIA */
        final MediaPlayer mDiaSound1, mDiaSound2, mDiaSound3, mDiaSound4, mDiaSound5, mDiaSound6;
        mDiaSound1 = new MediaPlayer(); mDiaSound2 = new MediaPlayer(); mDiaSound3 = new MediaPlayer(); mDiaSound4 = new MediaPlayer(); mDiaSound5 = new MediaPlayer(); mDiaSound6 = new MediaPlayer();
        prepareAudio(mDiaSound1, R.raw.dia1);
        prepareAudio(mDiaSound2, R.raw.dia2);
        prepareAudio(mDiaSound3, R.raw.dia3);
        prepareAudio(mDiaSound4, R.raw.dia4);
        prepareAudio(mDiaSound5, R.raw.dia5);
        prepareAudio(mDiaSound6, R.raw.bubudesuwa);
        btnDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random = r.nextInt(6) + 1;
                switch (random) {
                    case 1:
                        mDiaSound1.start();
                        msg = "You look tired. Shall we relax with a cup of green tea?";
                        showSnack(msg, mDiaSound1.getDuration());
                        break;
                    case 2:
                        mDiaSound2.start();
                        msg = "So, you like my smile? Well, thank you. *Chuckle* Hearing that makes me happy.";
                        showSnack(msg, mDiaSound2.getDuration());
                        break;
                    case 3:
                        mDiaSound3.start();
                        msg = "Your support is what keeps Aqours going. I hope you'll always be there for us!";
                        showSnack(msg, mDiaSound3.getDuration());
                        break;
                    case 4:
                        mDiaSound4.start();
                        msg = "Talking with you...isn't so bad.";
                        showSnack(msg, mDiaSound4.getDuration());
                        break;
                    case 5:
                        mDiaSound5.start();
                        msg = "Santa only visits good girls and boys. Heh, heh. I've got nothing to worry about.";
                        showSnack(msg, mDiaSound5.getDuration());
                        break;
                    case 6:
                        mDiaSound6.start();
                        msg = "WRONG!!!!";
                        showSnack(msg, mDiaSound6.getDuration());
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
