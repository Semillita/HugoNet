package io.semillita.hugonet;

public class Post {
	
	private String description;
	private long ID;
	
	public Post(final String description, final long ID) {
		this.description = description;
		this.ID = ID;
	}
	
	public String getDescription() {
		return description;
	}

	public long getID() {
		return ID;
	}

	
}
