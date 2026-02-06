package Class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "inception";
        inception.review = "It was good";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "About Time";
        aboutTime.review = "It was amazing";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("Title: " + review.title + " Review: " + review.review);

        }
    }
}
