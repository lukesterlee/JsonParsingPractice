package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 6/15/2015.
 */
public class Practice2Spotify {

    // this returns top 10 tracks of Beyonce
    private static final String JSON_SPOTIFY_ENDPOINT = "https://api.spotify.com/v1/artists/6vWDO969PvNqNYHIOW5v0m/top-tracks?country=US";

    public static void main(String[] args) {

        // TODO : Goal 1 - print entire json string.
        System.out.println(getJsonString());

        // TODO : Goal 2 - print the second song's album cover Url (in String!)
        System.out.println(getAlbumCoverUrl(1));

        // TODO : Goal 3 - print the fifth song's title and album name.
        System.out.println(getTitleAndAlbumName(4));

    }

    private static String getJsonString() {
        String result = "";
        
        // TODO : Step 1 - create an URL instance with Step 0's result

        // TODO : Step 2 - create a Http Url Connection with Step 1's URL

        // TODO : Step 3 - get inputstream from Step 2 and create an instance of BufferedReader

        // TODO : Step 4 - create a string builder instance

        // TODO : Step 5 - read json file until the end of the line and write into string builder and save it into String variable "result"

        return result;
    }

    private static String getAlbumCoverUrl(int position) {
        String result = "";


        return result;
    }

    private static String getTitleAndAlbumName(int position) {
        String result = "";


        return result;
    }
}
