public class Song {
    private String title;
    private String author;
    private String text;

    public Song(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title: " + title + '\'' +
                " author: " + author + '\'' +
                " text: \n" + text + '\'' +
                '}';
    }
}
