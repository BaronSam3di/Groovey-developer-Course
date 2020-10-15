@groovy.transform.ToString()
class Tweet{

    String username
    String text
    Integer favourites
    Integer retweets
    Date createdOn

    public Tweet(String user,String tweet) {
        username = user
        text = tweet
        retweets = 0
        favourites = 0
        createdOn = new Date() 
    }

    void addToRetweets(){
        retweets += 1
    }

    void addToFavourites(){
        favourites += 1
    }

}

def tweet = new Tweet("BobMorton"," Dick Jones Runns the cops!!")
println tweet