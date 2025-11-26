package com.mph.MavenProject7;

public class Youtube extends Video{

	public Youtube(ProcessingQuality quality) {
		super(quality);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playVideo() {
		// TODO Auto-generated method stub
		System.out.println("Playing Video in Youtube");
		quality.processVideo();
		
	}

}
