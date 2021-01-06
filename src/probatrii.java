import java.util.Scanner;

public class probatrii {
    public static class Article {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newTitle) {
            this.title = newTitle;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] initialArticle = input.split(", ");

        int numberOfTokens = Integer.parseInt(sc.nextLine());

        Article article = new Article(initialArticle[0], initialArticle[1], initialArticle[2]);
        for (int i = 0; i < numberOfTokens; i++) {
            String[] tokens = sc.nextLine().split(": ");
            String command = tokens[0];
            String argument = tokens[1];
            if (command.equals("Edit")) {
                article.edit(argument);
            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(argument);
            } else if (command.equals("Rename")){
                article.rename(argument);
            }
        }
        System.out.println(article.toString());
    }
}
