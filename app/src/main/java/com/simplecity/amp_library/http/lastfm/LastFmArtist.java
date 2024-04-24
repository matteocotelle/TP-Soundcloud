package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmArtist implements LastFmResult {

    @SerializedName("artist")
    public Artist artist;

    public static class Artist {
        private String name;  // Rendu non-public et ajout des accesseurs
        @SerializedName("image")
        public List<LastFmImage> images = new ArrayList<>();
        public Bio bio;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Override
    public String getImageUrl() {
        if (artist == null || artist.images == null || artist.images.isEmpty()) {
            return null;
        }
        return LastFmUtils.getBestImageUrl(artist.images);
    }

    public static class Bio {
        public String summary;
    }
}
