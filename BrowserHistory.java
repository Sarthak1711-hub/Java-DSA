import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> currHistory;
    Deque<String> forwardHistory;

    public BrowserHistory(String homepage) {

        currHistory = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();

        currHistory.push(homepage);
    }

    public void visit(String url) {

        currHistory.push(url);
        while (!forwardHistory.isEmpty()) {
            forwardHistory.pop();
        }

    }

    public String back(int steps) {

        while (steps > 0) {

            if (currHistory.size() > 1) {

                String backtab = currHistory.pop();

                forwardHistory.push(backtab);
            } else {
                break;
            }
            steps--;
        }

        return currHistory.peek();
    }

    public String forward(int steps) {

        while (steps > 0) {

            if (!forwardHistory.isEmpty()) {

                String forwardTab = forwardHistory.pop();

                currHistory.push(forwardTab);
            } else {
                break;
            }

            steps--;
        }

        return currHistory.peek();
    }

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory("leetcode.com");

        browser.visit("google.com");
        browser.visit("facebook.com");
        browser.visit("youtube.com");

        System.out.println(browser.back(1)); 
        System.out.println(browser.back(1)); 
        System.out.println(browser.forward(1)); 

        browser.visit("linkedin.com");

        System.out.println(browser.forward(2)); 
        System.out.println(browser.back(2)); 
        System.out.println(browser.back(7)); 
    }

}
