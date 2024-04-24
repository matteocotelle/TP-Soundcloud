package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmAlbum implements LastFmResult {

    @SerializedName("album")
    private Album album;

    public static class Album {
        private String name;
        @SerializedName("image")
        private List<LastFmImage> images = new ArrayList<>();
        private Wiki wiki;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<LastFmImage> getImages() {
            return new ArrayList<>(images);
        }

        public void setImages(List<LastFmImage> images) {
            this.images = new ArrayList<>(images);
        }

        public Wiki getWiki() {
            return wiki;
        }

        public void setWiki(Wiki wiki) {
            this.wiki = wiki;
        }
    }

    @Override
    public String getImageUrl() {
        if (album != null) {
            return LastFmUtils.getBestImageUrl(album.getImages());
        } else {
            return null;
        }
    }

    public static class Wiki {
        private String summary;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
