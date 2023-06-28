package ch06;

public class Melon {
	int rank;
	private String title;
	private String artist;
	private String album;
	private String imgUrl;
	
	public Melon() { }
	public Melon(int rank, String title, String artist, String album, String imgUrl) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.imgUrl = imgUrl;
	}

	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	@Override
	public String toString() {
		return "Melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", imgUrl="
				+ imgUrl + "]";
	}
	
	


}
