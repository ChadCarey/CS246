
import java.util.List;

/**
 * Provides methods for analysis of social media data
 *
 * DO NOT MODIFY THIS CLASS!!
 * 
 * @author sburton
 */

// DO NOT MODIFY THIS CLASS!!
public class DataAnalyzer {
    /**
     * Analyzes a list of social media entries
     * @param entries 
     */
    public void analyzeEntries(List<SocialMediaEntry> entries) {
        for (SocialMediaEntry entry : entries) {
            // do anlysis here
            System.out.println("Analyzing '" + entry.getPostText() + "' by " + entry.getUser());
        }
        
        // Print a blank line at the end
        System.out.println();
    }
}
