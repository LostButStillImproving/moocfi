package ChapterFive.Two;

public class Book {

    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.setAuthor(author);
        this.setName(name);
        this.setPages(pages);
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
