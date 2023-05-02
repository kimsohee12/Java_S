import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class Controller {

	// Controller 역할 : 비니즈니 로직 
	// View로 부터 데이터를 받아서 가공 or 처리역할
	// model의 데이터를 수정하거나 가지고오는 역할 수행
	// View에 결과를 전달하는 역할 
	
	//곡 5개를 저장할 수 있는 ArrayList 생성 
	 ArrayList <Model> musicList = new ArrayList<Model>(5);
	
	 //노래를 재생 / 정지할수 있는 기능을 가진 객체 생성 ->player .jar(mp3player 활용)
	 MP3Player mp3 = new MP3Player();
	 
	 //musicList에 있는 노래 순서를 관리할 수 있는 변수 생성
	 int index = 0; //전역변수 : 모든 메소드들이 공유할 수 있도록 
	 				//지역변수 :  {}안에서만 사용 가능한 변수
	 //생성자
	 public Controller() {
		 // Controller 객체가 생성이 되자마자 음악을 미리 세팅 -> 바로 재생 가능하도록
		 // Model 객체 생성
		musicList.add(new Model("attention", "뉴진스", 30,"music/attention.mp3"));
		//경로는 정확히 이름 써줘야 가능 띄어쓰기X
		// /: 폴더 안에 들어감
		musicList.add(new Model("cookie", "뉴진스", 50,"music/cookie.mp3"));
		musicList.add(new Model("ditto", "뉴진스", 100,"music/ditto.mp3"));
		musicList.add(new Model("hypeboy", "뉴진스", 120,"music/hypeboy.mp3"));
		musicList.add(new Model("OMG", "뉴진스", 118,"music/OMG.mp3"));
	 }
	 
	 // 재생
	 public void play() {
		 //현재 재생중인 음악이 있는지
		 if( mp3.isPlaying()) {
			 //현재 재생중인 음악 정지
			 mp3.stop();
		 }
		 
		 //index 가 가리키고 있는 위치에 음악을 재생 // MP3Player 에 있는 기능
		mp3.play(musicList.get(index).getMusicPath());// mp3.play->mp3가 가지고 있는기능
		show();
		
	}
	 //정지
	 public void stop() {
		 mp3.stop();
	 }
	 
	 //다음곡 재생
	 public void next() {
		 //재생중인 음악 있는지 확인후 있으면 재생 정지
		 if(mp3.isPlaying()) {
			 mp3.stop();
		 }
		 if(index < musicList.size()-1) {
			 index++; // 다음곡 재생하기 위해 인덱스 1증가
		 }else {
			 index = 0;
		 }
		mp3.play(musicList.get(index).getMusicPath());
		show();
	}
	 
	 //이전곡 재생 
	 public void pre () {
		 if(mp3.isPlaying()) {
			 mp3.stop();
		 }
		 if(index>0) {
			 index --;
		 }else{
			 index =musicList.size()-1;
		 }
		 mp3.play(musicList.get(index).getMusicPath());
		 show();
	}
	 
	 //현재 재생곡 정보 출력
	 public void show() {
		 System.out.println(musicList.get(index).getSongName() + " - " + musicList.get(index).getSiger());
	}
	
	
	
}
