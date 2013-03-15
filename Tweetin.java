import java.net.*;
import java.io.*;
import java.util.*;
public class Tweetin {
  public static void main(String[] args) throws Exception {
      	String tweet;
  		String fn ="";

		if(args.length!=0){
			fn = args[0];
			//System.out.println(fn); //the query string for the URL 
			URL tweetin = new URL("http://search.twitter.com/search.json?q="+fn+"&rpp=100&include_entities=true&result_type=recent"); 
			BufferedReader in = new BufferedReader(new InputStreamReader(tweetin.openStream()));

			String input;
			String tweet2; //each token of the input 

			while ((input = in.readLine()) != null) { //while there is input in bufferedreader 
				Scanner s = new Scanner(input).useDelimiter(",");
				//System.out.println(input);
				String finder ="display_url"; //the portion of each input we actually care about
				while(s.hasNext()) {
					tweet2=s.next(); 
					//System.out.println(tweet2);
					if(tweet2.length()>=12) { //if the beginning of the token is long enough to be what we are looking for, display_url. without this if statement i was getting array out of bounds errors		            	 
						if(tweet2.substring(1,12).equals(finder)) { //if tweet2 without the quotes it has in the input is a display_url
							tweet = tweet2.substring(15, (tweet2.length()-1)); //the actual URL begins at spot 15 in the token, and ends with a quote, which is why i ended the substring one before the length of the substring
							tweet=tweet.replaceAll("/",""); //remove random /s 
							System.out.println(tweet);							
					 	}
		        	}
				}
			}
		   	in.close();
		}
		else {  //if the user didn't enter a hashtag as a command argument #errortrapping
			System.out.println("Enter the hashtag as the command line argument");
		}
	}
}
