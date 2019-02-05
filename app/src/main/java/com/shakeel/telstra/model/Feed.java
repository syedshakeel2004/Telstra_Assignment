package com.shakeel.telstra.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("rows")
    @Expose
    private List<Row> rows = new ArrayList<Row>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

//	private String title, thumbnailUrl;
//	private String description;
//
//	public Feed() {
//	}
//
//	public Feed(String name, String thumbnailUrl,
//				String description) {
//		this.title = name;
//		this.thumbnailUrl = thumbnailUrl;
//		this.description = description;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String name) {
//		this.title = name;
//	}
//
//	public String getThumbnailUrl() {
//		return thumbnailUrl;
//	}
//
//	public void setThumbnailUrl(String thumbnailUrl) {
//		this.thumbnailUrl = thumbnailUrl;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
}
