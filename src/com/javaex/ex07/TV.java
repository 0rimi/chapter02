package com.javaex.ex07;

public class TV {

	// 필드
	private int channel, volume;
	private boolean power;

	// 생성자
	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 getter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	// 메소드 - 일반
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void channel(int channel) {
		if (this.power == true) { // TV가 켜져있을 때
			if (channel > 255) {
				this.channel = 255;
			} else if (channel < 1) {
				this.channel = 1;
			} else {
				this.channel = channel;
			}
		} else {
			System.out.println("전원이 꺼져 채널이 변경되지 않습니다.");
		}
	}
	//여기잘봐두기
	public void channel(boolean up) {
		int nextchannel; //불린 이후 채널값을 int로 선언.
		if (up == true) {
			nextchannel = this.channel + 1;
		} else {
			nextchannel = this.channel - 1;
		}

		this.channel(nextchannel);
		//왜 이렇게 됨? this.channel = nextChannel하면 앞 메소드 작동 x
		//작동을 안했다기보다는 그냥 대입이라 그럼
		//호출을 한다는 의미, 대신 시켜보겠다~
	}

	public void volume(int volume) {
		if (this.power == true) {
			if (volume > 100) {
				this.volume = 100;
			} else if (volume < 0) {
				this.volume = 0;
			} else {
				this.volume = volume;
			}
		} else {
			System.out.println("전원이 꺼져 볼륨이 변경되지 않습니다.");
		}
	}

	public void volume(boolean up) {
		int nextVolume;
		if (up == true) {
			nextVolume = this.volume + 1;
		} else {
			nextVolume = this.volume - 1;
		}

		this.volume(nextVolume);

	}

	public void status() {

		String powerOn;

		if (this.power == true) {
			powerOn = "on";
		} else {
			powerOn = "off";
		}

		System.out.println("[Power]:" + powerOn + "\t[Channel]:" + this.channel + "\t[Volume]:" + this.volume);

	}
}