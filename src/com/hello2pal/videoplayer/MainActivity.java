package com.hello2pal.videoplayer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {

	VideoView videoView;
	MediaController mediaController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * If you need to control the video while it is playing, you need to
		 * initialize MediaController.
		 */
		mediaController = new MediaController(this);

		videoView = (VideoView) findViewById(R.id.videoView1);
		/*
		 * Set the video path. I have create Video directory and inside the
		 * video directory the video file(.mp4). As your requirement you can
		 * customize the path.
		 */
		videoView.setVideoPath("sdcard/Video/test.mp4");
		/* If you don't want to show controller just comment the below line only */
		videoView.setMediaController(mediaController);
		/* To start video */
		videoView.start();
	}

}
