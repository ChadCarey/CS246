/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chad
 */
public class YouTubeAdapter implements SocialMediaEntry {
    
    YouTubeVideo video;
    
    YouTubeAdapter(YouTubeVideo v) {
        video = v;
    }

    @Override
    public String getUser() {
        return video.getAuthor();
    }

    @Override
    public String getPostText() {
        return video.getTitle() + " - " + video.getDescription();
    }
    
    
    
}
