import javax.management.loading.PrivateClassLoader;

public class Model {

	//Music 설계도 
	//VO (value object)
	
	//필드
	private String songName; //음악 제목
	private String siger;//가수 이름
	private int playTime;//음악길이 (s)
	private String musicPath;//음악파일 경로
	
	//생성자
	public Model(String songName, String siger , int playTime , String musicPath) {
		this.songName = songName;
		this.siger =siger;
		this.playTime =playTime;
		this.musicPath = musicPath;
	}

	//getter, setter
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSiger() {
		return siger;
	}
	public void setSiger(String siger) {
		this.siger = siger;
	}
	public int getPlayTime() {
		return playTime;
	}
	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	public String getMusicPath() {
		return musicPath;
	}
	public void setMusicPath(String musicPath) {
		this.musicPath = musicPath;
	}
	
	
	
	
}
