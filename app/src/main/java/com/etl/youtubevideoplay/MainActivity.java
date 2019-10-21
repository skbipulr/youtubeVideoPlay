package com.etl.youtubevideoplay;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.etl.youtubevideoplay.models.YoutubeDataModel;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends YouTubeBaseActivity  implements  YouTubePlayer.OnInitializedListener,
YouTubePlayer.PlaybackEventListener,YouTubePlayer.PlayerStateChangeListener{

    YouTubePlayerView PlayerView;
    private YoutubeDataModel youtubeDataModel = null;
   // private static final String API_KEY = "AIzaSyDMj1MJm3ybzN_50VYFoca_l2-I5_pk7Js";
 //   String VIDEO_ID = "PLhQjrBD2T381L3iZyDTxRwOBuUt6m1FnW";

    //anathor
    private static final int READ_STORAGE_PERMISSION_REQUEST_CODE = 1;
    private static String GOOGLE_YOUTUBE_API = "AIzaSyBH8szUCt1ctKQabVeQuvWgowaKxHVjn8E";
  //  private YoutubeDataModel youtubeDataModel = null;

    // ImageView imageViewIcon;
    public static final String VIDEO_ID = "xWCkGBuWvDw";
    //public static final String VIDEO_ID = "G_E7ESLsmJ0";
    private YouTubePlayerView mYoutubePlayerView = null;
    private YouTubePlayer mYoutubePlayer = null;
  //  private ArrayList<YoutubeCommentModel> mListData = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtubeDataModel = getIntent().getParcelableExtra(YoutubeDataModel.class.toString());
        PlayerView = findViewById(R.id.playerView);
       PlayerView.initialize(GOOGLE_YOUTUBE_API,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(playbackEventListener);

        if (!b){
            youTubePlayer.cueVideo(youtubeDataModel.getVideo_id());
        }

        mYoutubePlayer = youTubePlayer;
    }


    private YouTubePlayer.PlaybackEventListener playbackEventListener = new YouTubePlayer.PlaybackEventListener() {
        @Override
        public void onPlaying() {

        }

        @Override
        public void onPaused() {

        }

        @Override
        public void onStopped() {

        }

        @Override
        public void onBuffering(boolean b) {

        }

        @Override
        public void onSeekTo(int i) {

        }
    };

    private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
        @Override
        public void onLoading() {

        }

        @Override
        public void onLoaded(String s) {

        }

        @Override
        public void onAdStarted() {

        }

        @Override
        public void onVideoStarted() {

        }

        @Override
        public void onVideoEnded() {

        }

        @Override
        public void onError(YouTubePlayer.ErrorReason errorReason) {

        }
    };


    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }
}
