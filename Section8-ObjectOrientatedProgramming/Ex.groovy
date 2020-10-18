@groovy.transform.Canonical
class Tweet {
    
    String post
    String username
    Date postDate
    
    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtags = []
    
    void fav(String username) {
        favorites << username
        }
        
    List getFavorites(){
        favorites
    }
    
    void retweets(String username){
        retweets << username
    }
    
    List getRetweets(){
           retweets
    }
    
    List getMentions(){
        String pattern = /\B@[a-z0-9_-]+/
        post.findAll(pattern)
    }
    
    List getHashtags(){
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        post.findAll(pattern)
    }
    
}

Tweet tweet = new Tweet(post: " This is great by @Apache is super! #Java #groovylang", username:"DickJones", postDate:new Date() )

println tweet

tweet.fav("@Apache")
tweet.retweets("@MarkBlyth")

println tweet.getFavorites()
println tweet.getRetweets()

println tweet.getMentions()
println tweet.getHashtags()