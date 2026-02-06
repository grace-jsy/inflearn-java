package Class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "It was good";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "It was amazing";

        System.out.println("Title: " + inception.title + " Review: " + inception.review);
        System.out.println("Title: " + aboutTime.title + " Review: " + aboutTime.review);
    }
}
