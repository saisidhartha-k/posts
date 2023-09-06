package com.prodapt.learningspring.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Embeddable
public class LikeId implements Serializable{

	private static final long serialVersionUID = 5469065220719817005L;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	  @JoinColumn(name = "user_id", referencedColumnName = "id")
	  private User user;
	  
	  @ManyToOne(cascade = CascadeType.MERGE)
	  @JoinColumn(name = "post_id", referencedColumnName = "id")
	  private Post post;
	  public LikeId() {
		}
	
	  public LikeId(User user, Post post) {
			super();
			this.user = user;
			this.post = post;
		}
	
	  
	  public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Post getPost() {
		return post;
	}
	
	public void setPost(Post post) {
		this.post = post;
	}
	

}